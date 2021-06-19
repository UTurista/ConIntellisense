// Generated from ../ConGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConGrammarParser}.
 */
public interface ConGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ConGrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ConGrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ConGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ConGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ConGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ConGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#returnExp}.
	 * @param ctx the parse tree
	 */
	void enterReturnExp(ConGrammarParser.ReturnExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#returnExp}.
	 * @param ctx the parse tree
	 */
	void exitReturnExp(ConGrammarParser.ReturnExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#commentExp}.
	 * @param ctx the parse tree
	 */
	void enterCommentExp(ConGrammarParser.CommentExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#commentExp}.
	 * @param ctx the parse tree
	 */
	void exitCommentExp(ConGrammarParser.CommentExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#includeExp}.
	 * @param ctx the parse tree
	 */
	void enterIncludeExp(ConGrammarParser.IncludeExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#includeExp}.
	 * @param ctx the parse tree
	 */
	void exitIncludeExp(ConGrammarParser.IncludeExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#runExp}.
	 * @param ctx the parse tree
	 */
	void enterRunExp(ConGrammarParser.RunExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#runExp}.
	 * @param ctx the parse tree
	 */
	void exitRunExp(ConGrammarParser.RunExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#callExp}.
	 * @param ctx the parse tree
	 */
	void enterCallExp(ConGrammarParser.CallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#callExp}.
	 * @param ctx the parse tree
	 */
	void exitCallExp(ConGrammarParser.CallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#assignExp}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(ConGrammarParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#assignExp}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(ConGrammarParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#declarationExp}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationExp(ConGrammarParser.DeclarationExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#declarationExp}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationExp(ConGrammarParser.DeclarationExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifier(ConGrammarParser.DeclarationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifier(ConGrammarParser.DeclarationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExp(ConGrammarParser.ConditionalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExp(ConGrammarParser.ConditionalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#conditionalMultiExp}.
	 * @param ctx the parse tree
	 */
	void enterConditionalMultiExp(ConGrammarParser.ConditionalMultiExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#conditionalMultiExp}.
	 * @param ctx the parse tree
	 */
	void exitConditionalMultiExp(ConGrammarParser.ConditionalMultiExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#whileExp}.
	 * @param ctx the parse tree
	 */
	void enterWhileExp(ConGrammarParser.WhileExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#whileExp}.
	 * @param ctx the parse tree
	 */
	void exitWhileExp(ConGrammarParser.WhileExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ConGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ConGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(ConGrammarParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(ConGrammarParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ConGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ConGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConGrammarParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(ConGrammarParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConGrammarParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(ConGrammarParser.VectorContext ctx);
}