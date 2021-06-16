// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\Z3Parser.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Z3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Z3ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Z3Parser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Z3Parser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementFunction}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFunction(Z3Parser.StatementFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementIfElse}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIfElse(Z3Parser.StatementIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementNumber}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNumber(Z3Parser.StatementNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Z3Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Z3Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Z3Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Z3Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link Z3Parser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionAnd(Z3Parser.LogicalExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionComparison}
	 * labeled alternative in {@link Z3Parser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionComparison(Z3Parser.LogicalExpressionComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionVariable}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionVariable(Z3Parser.MathExpressionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionBasicNumber(Z3Parser.MathExpressionBasicNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionVariable}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionVariable(Z3Parser.ComparisonExpressionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionGreaterThan}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionGreaterThan(Z3Parser.ComparisonExpressionGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionGreaterThanOrEqual(Z3Parser.ComparisonExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionLessThan}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionLessThan(Z3Parser.ComparisonExpressionLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionLessThanOrEqual}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionLessThanOrEqual(Z3Parser.ComparisonExpressionLessThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionEqualTo}
	 * labeled alternative in {@link Z3Parser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionEqualTo(Z3Parser.ComparisonExpressionEqualToContext ctx);
	/**
	 * Visit a parse tree produced by {@link Z3Parser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(Z3Parser.TypesContext ctx);
}