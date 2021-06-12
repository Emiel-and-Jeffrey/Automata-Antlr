// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammars\Z3Parser.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Z3Parser}.
 */
public interface Z3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Z3Parser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(Z3Parser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(Z3Parser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Z3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Z3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Z3Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Z3Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Z3Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Z3Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link Z3Parser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionAnd(Z3Parser.LogicalExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link Z3Parser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionAnd(Z3Parser.LogicalExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionComparison}
	 * labeled alternative in {@link Z3Parser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionComparison(Z3Parser.LogicalExpressionComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionComparison}
	 * labeled alternative in {@link Z3Parser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionComparison(Z3Parser.LogicalExpressionComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionVariable}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionVariable(Z3Parser.MathExpressionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionVariable}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionVariable(Z3Parser.MathExpressionVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionBasicNumber(Z3Parser.MathExpressionBasicNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionBasicNumber(Z3Parser.MathExpressionBasicNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionVariable}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionVariable(Z3Parser.ComparisonExpressionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionVariable}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionVariable(Z3Parser.ComparisonExpressionVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionGreaterThan}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionGreaterThan(Z3Parser.ComparisonExpressionGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionGreaterThan}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionGreaterThan(Z3Parser.ComparisonExpressionGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionGreaterThanOrEqual(Z3Parser.ComparisonExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionGreaterThanOrEqual(Z3Parser.ComparisonExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionLessThan}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionLessThan(Z3Parser.ComparisonExpressionLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionLessThan}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionLessThan(Z3Parser.ComparisonExpressionLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionLessThanOrEqual}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionLessThanOrEqual(Z3Parser.ComparisonExpressionLessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionLessThanOrEqual}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionLessThanOrEqual(Z3Parser.ComparisonExpressionLessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionEqualTo}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionEqualTo(Z3Parser.ComparisonExpressionEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionEqualTo}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionEqualTo(Z3Parser.ComparisonExpressionEqualToContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3Parser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(Z3Parser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(Z3Parser.TypesContext ctx);
}