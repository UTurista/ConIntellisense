//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from ConGrammar.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace ConIntellisense.Core.Parser {
using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="ConGrammarParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public interface IConGrammarListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.file"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFile([NotNull] ConGrammarParser.FileContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.file"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFile([NotNull] ConGrammarParser.FileContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBlock([NotNull] ConGrammarParser.BlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBlock([NotNull] ConGrammarParser.BlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] ConGrammarParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] ConGrammarParser.ExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.returnExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReturnExp([NotNull] ConGrammarParser.ReturnExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.returnExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReturnExp([NotNull] ConGrammarParser.ReturnExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.commentExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCommentExp([NotNull] ConGrammarParser.CommentExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.commentExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCommentExp([NotNull] ConGrammarParser.CommentExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.includeExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIncludeExp([NotNull] ConGrammarParser.IncludeExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.includeExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIncludeExp([NotNull] ConGrammarParser.IncludeExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.runExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRunExp([NotNull] ConGrammarParser.RunExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.runExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRunExp([NotNull] ConGrammarParser.RunExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.callExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCallExp([NotNull] ConGrammarParser.CallExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.callExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCallExp([NotNull] ConGrammarParser.CallExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.assignExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignExp([NotNull] ConGrammarParser.AssignExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.assignExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignExp([NotNull] ConGrammarParser.AssignExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.declarationExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDeclarationExp([NotNull] ConGrammarParser.DeclarationExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.declarationExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDeclarationExp([NotNull] ConGrammarParser.DeclarationExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.declarationModifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDeclarationModifier([NotNull] ConGrammarParser.DeclarationModifierContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.declarationModifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDeclarationModifier([NotNull] ConGrammarParser.DeclarationModifierContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.conditionalExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConditionalExp([NotNull] ConGrammarParser.ConditionalExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.conditionalExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConditionalExp([NotNull] ConGrammarParser.ConditionalExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.conditionalMultiExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConditionalMultiExp([NotNull] ConGrammarParser.ConditionalMultiExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.conditionalMultiExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConditionalMultiExp([NotNull] ConGrammarParser.ConditionalMultiExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.whileExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhileExp([NotNull] ConGrammarParser.WhileExpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.whileExp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhileExp([NotNull] ConGrammarParser.WhileExpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.condition"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCondition([NotNull] ConGrammarParser.ConditionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.condition"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCondition([NotNull] ConGrammarParser.ConditionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.comparator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterComparator([NotNull] ConGrammarParser.ComparatorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.comparator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitComparator([NotNull] ConGrammarParser.ComparatorContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.literal"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLiteral([NotNull] ConGrammarParser.LiteralContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.literal"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLiteral([NotNull] ConGrammarParser.LiteralContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ConGrammarParser.vector"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVector([NotNull] ConGrammarParser.VectorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ConGrammarParser.vector"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVector([NotNull] ConGrammarParser.VectorContext context);
}
} // namespace ConIntellisense.Core.Parser