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

        public override IEnumerable<string> VisitCallExp([NotNull] ConGrammarParser.CallExpContext context)
        {
            if (!IsCursorInsideNode(context))
            {
                return base.VisitCallExp(context);
            }

            // We know the cursor is inside this node
            // But we still need to find out if is on the identifier or one of the arguments
            if(WhereIsCursosRelativeToToken(context.IDENTIFIER().Symbol) == 0)
            {
                return FindSugestionsHelper.AutoCompleteCommand(methodsTable, context.IDENTIFIER().GetText());
            }

            // We need to find out which argument it is
            var arguments = context.literal();
            for (var argumentIdx = 0; argumentIdx < arguments.Length; argumentIdx++)
            {
                if (IsCursorInsideNode(arguments[argumentIdx]))
                {
                    return FindSugestionsHelper.AutoCompleteArgument(context.IDENTIFIER().GetText(), arguments[argumentIdx].GetText());
                }
            }

            // We should never reach here, since we know the cursor is inside this node
            // it should go to either the identifier or on of the arguments.
            return null;
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
            if(WhereIsCursosRelativeToToken(context.Start) < 0)
            {
                // Cursor is BEFORE the initial token
                return false;
            }

            if (WhereIsCursosRelativeToToken(context.Stop) > 0)
            {
                // Cursor is AFTER the final token
                return false;
            }

            return true;
        }

        /// <summary>
        /// Indicates where the cursor is relative to
        /// the given token.
        /// </summary>
        /// <param name="token">The token to compare to.</param>
        /// <returns>-1 if the cursor is BEFORE this token, 1 if the cursor is AFTER this token and zero when the cursor is on the token.</returns>
        private int WhereIsCursosRelativeToToken(IToken token)
        {
            // Verifying the lines
            if (line < token.Line || line > token.Line)
            {
                return -1;
            }

            if (column < token.StartIndex || column > token.StopIndex)
            {
                return 1;
            }

            return 0;
        }
    }
}
