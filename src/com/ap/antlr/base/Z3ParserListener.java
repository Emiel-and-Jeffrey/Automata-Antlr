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
	 * Enter a parse tree produced by the {@code StatnentVariableDeclaration}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatnentVariableDeclaration(Z3Parser.StatnentVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatnentVariableDeclaration}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatnentVariableDeclaration(Z3Parser.StatnentVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementFunction}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFunction(Z3Parser.StatementFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementFunction}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFunction(Z3Parser.StatementFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementIfElse}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIfElse(Z3Parser.StatementIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementIfElse}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIfElse(Z3Parser.StatementIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementValue}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementValue(Z3Parser.StatementValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementValue}
	 * labeled alternative in {@link Z3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementValue(Z3Parser.StatementValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueVariable(Z3Parser.ValueVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueVariable(Z3Parser.ValueVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueString(Z3Parser.ValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueString(Z3Parser.ValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueBasicNumber}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueBasicNumber(Z3Parser.ValueBasicNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueBasicNumber}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueBasicNumber(Z3Parser.ValueBasicNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueComparisonExpresssion}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueComparisonExpresssion(Z3Parser.ValueComparisonExpresssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueComparisonExpresssion}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueComparisonExpresssion(Z3Parser.ValueComparisonExpresssionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueFunctionCall}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueFunctionCall(Z3Parser.ValueFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueFunctionCall}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueFunctionCall(Z3Parser.ValueFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueLogicalExpression}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueLogicalExpression(Z3Parser.ValueLogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueLogicalExpression}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueLogicalExpression(Z3Parser.ValueLogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueNumericExpression}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueNumericExpression(Z3Parser.ValueNumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueNumericExpression}
	 * labeled alternative in {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueNumericExpression(Z3Parser.ValueNumericExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link Z3Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(Z3Parser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(Z3Parser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Z3Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Z3Parser.VariableContext ctx);
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
	 * labeled alternative in {@link Z3Parser#z3_logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionAnd(Z3Parser.LogicalExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link Z3Parser#z3_logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionAnd(Z3Parser.LogicalExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link Z3Parser#z3_logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionOr(Z3Parser.LogicalExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link Z3Parser#z3_logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionOr(Z3Parser.LogicalExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionNot}
	 * labeled alternative in {@link Z3Parser#z3_logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionNot(Z3Parser.LogicalExpressionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionNot}
	 * labeled alternative in {@link Z3Parser#z3_logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionNot(Z3Parser.LogicalExpressionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionAdd}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionAdd(Z3Parser.NumericExpressionAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionAdd}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionAdd(Z3Parser.NumericExpressionAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionMinus}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionMinus(Z3Parser.NumericExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionMinus}
	 * labeled alternative in {@link Z3Parser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionMinus(Z3Parser.NumericExpressionMinusContext ctx);
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