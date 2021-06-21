using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using ConIntellisense.Core.Context.Command;
using ConIntellisense.Core.Helper;
using ConIntellisense.Core.Parser;
using System.Collections.Generic;


namespace ConIntellisense.Core.Visitor
{
    public class FindSugestionsVisitor : ConGrammarBaseVisitor<IEnumerable<string>>
    {
        private readonly int line;
        private readonly int column;
        private readonly IEnumerable<Command> methodsTable;

        /// <summary>
        /// 
        /// </summary>
        /// <param name="methodsTable"></param>
        /// <param name="line">Index 1</param>
        /// <param name="column"></param>
        public FindSugestionsVisitor(IEnumerable<Command> methodsTable, int line, int column)
        {
            this.line = line;
            this.column = column;
            this.methodsTable = methodsTable;
        }

        public override IEnumerable<string> VisitFile([NotNull] ConGrammarParser.FileContext context)
        {
            
            // If there's not a single character to limit the scope of our
            // sugestion we return everything
            if(column == 0)
            {
                return FindSugestionsHelper.AutoCompleteRoot(methodsTable);
                
            }
            
            return base.VisitFile(context);
        }


        public override IEnumerable<string> VisitBlock([NotNull] ConGrammarParser.BlockContext context)
        {
            if (IsCursorInsideNode(context))
            {
                foreach (var literal in context.expression())
                {
                    if (IsCursorInsideNode(literal))
                    {
                        VisitExpression(literal);
                    }
                }
            }
            return base.VisitBlock(context);
        }

        public override IEnumerable<string> VisitCallExp([NotNull] ConGrammarParser.CallExpContext context)
        {
            // We know the cursor is inside this node
            // But we still need to find out if is on the identifier or one of the arguments
            if(IsCursorOnToken(context.IDENTIFIER().Symbol))
            {
                return FindSugestionsHelper.AutoCompleteCommand(methodsTable, context.IDENTIFIER().GetText());
            }

            // We need to find out which argument it is
            var arguments = context.literal();
            for (var argumentIdx = 0; argumentIdx < arguments.Length; argumentIdx++)
            {
                if (IsCursorInsideNode(arguments[argumentIdx]))
                {
                    return FindSugestionsHelper.AutoCompleteArgument(methodsTable, context.IDENTIFIER().GetText(), argumentIdx, arguments[argumentIdx].GetText());
                }
            }

            // We should never reach here, since we know the cursor is inside this node
            // it should go to either the identifier or on of the arguments.
            return null;
        }

        public override IEnumerable<string> VisitRunExp([NotNull] ConGrammarParser.RunExpContext context)
        {
            var path = context.GetText().Substring(3).Trim(); // skip the 'run'
            return FindSugestionsHelper.AutoCompletePath(path);
        }

        public override IEnumerable<string> VisitIncludeExp([NotNull] ConGrammarParser.IncludeExpContext context)
        {
            var path = context.GetText().Substring(7).Trim(); // skip the 'include'
            return FindSugestionsHelper.AutoCompletePath(path);
        }

        protected override IEnumerable<string> AggregateResult(IEnumerable<string> aggregate, IEnumerable<string> nextResult)
        {
            return nextResult;
        }

        protected override bool ShouldVisitNextChild(IRuleNode node, IEnumerable<string> currentResult)
        {
            return currentResult is null;
        }

        private bool IsCursorInsideNode(ParserRuleContext context)
        {
            if (IsCursorBeforeTheToken(context.Start) || IsCursorAfterTheToken(context.Stop))
            {
                return false;
            }

            return true;
        }

        private bool IsCursorOnToken(IToken token)
        {
            // Can't be before and can't be after
            return !IsCursorBeforeTheToken(token) && !IsCursorAfterTheToken(token);
        }

        private bool IsCursorBeforeTheToken(IToken token)
        {
            // Check:
            // - Is the cursor on a previous line
            // - Is the cursor on the line but starts before the initial token
            return line < token.Line || (line == token.Line && column < token.Column);
        }


        private bool IsCursorAfterTheToken(IToken token)
        {
            var nextToken = token.TokenSource.NextToken();
            return !IsCursorBeforeTheToken(nextToken);
        }
    }
}
