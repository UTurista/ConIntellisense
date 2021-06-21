using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using ConIntellisense.Core.Parser;
using OmniSharp.Extensions.LanguageServer.Protocol.Document;
using OmniSharp.Extensions.LanguageServer.Protocol.Models;
using OmniSharp.Extensions.LanguageServer.Protocol.Server;
using OmniSharp.Extensions.LanguageServer.Protocol.Window;
using System;
using System.Linq;
using Range = OmniSharp.Extensions.LanguageServer.Protocol.Models.Range;

namespace ConIntellisense.Server.Listener
{
    public class SemanticTokensVisitor : ConGrammarBaseVisitor<bool>
    {
        private readonly SemanticTokensBuilder builder;
        private readonly ILanguageServerFacade router;

        public SemanticTokensVisitor(SemanticTokensBuilder builder, OmniSharp.Extensions.LanguageServer.Protocol.Server.ILanguageServerFacade router)
        {
            this.builder = builder;
            this.router = router;
        }

        public override bool VisitCommentExp([NotNull] ConGrammarParser.CommentExpContext context)
        {
            var startLine = context.Start.Line - 1;
            var startChar = context.Start.Column;
            var endLine = context.Stop.Line - 1;
            var endChar = context.Stop.Column + context.Stop.Text.Length;

            this.router.Window.LogInfo($"There's a comment from {startLine}@{startChar} to {endLine}@{endChar}");

            // The context returns the lines in index-1 while LSP uses index-0
            // The contex's lines are based on characters, while LSP references the spaces between the chars
            Range range = new(startLine, startChar, endLine, endChar);
            this.builder.Push(range, SemanticTokenType.Comment, SemanticTokenModifier.Documentation);
            return true;
        }


        public override bool VisitRunExp([NotNull] ConGrammarParser.RunExpContext context)
        {
            var startLine = context.Start.Line - 1;
            var startChar = context.Start.Column;
            var endLine = context.Stop.Line - 1;
            var endChar = context.Stop.Column + context.Stop.Text.Length;

            Range runRange = new(startLine, startChar, endLine, startChar + 3);
            this.builder.Push(runRange, SemanticTokenType.Keyword, Array.Empty<SemanticTokenModifier>());

            Range argRange = new(startLine, startChar + 3, endLine, endChar);
            this.builder.Push(argRange, SemanticTokenType.String, Array.Empty<SemanticTokenModifier>());
            return true;
        }

        public override bool VisitCallExp([NotNull] ConGrammarParser.CallExpContext context)
        {
            var command = context.IDENTIFIER();
            var commandLine = command.Symbol.Line - 1;
            var commandStartChar = command.Symbol.Column;
            var commands = command.GetText().Split(".");
            for(var i = 0; i<commands.Length - 1; i++)
            {
                var text = commands[i];
                Range argRange = new(commandLine, commandStartChar, commandLine, commandStartChar + text.Length);
                this.builder.Push(argRange, SemanticTokenType.Class, Array.Empty<SemanticTokenModifier>());
                commandStartChar += text.Length + 1;
            }

            var methodText = commands.Last();
            Range methodRange = new(commandLine, commandStartChar, commandLine, commandStartChar + methodText.Length);
            this.builder.Push(methodRange, SemanticTokenType.Method, Array.Empty<SemanticTokenModifier>());

            return true;
       }
          }
}
