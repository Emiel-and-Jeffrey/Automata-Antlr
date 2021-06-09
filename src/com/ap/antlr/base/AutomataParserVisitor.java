// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammars\AutomataParser.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutomataParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutomataParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutomataParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AutomataParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(AutomataParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AutomataParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link AutomataParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AutomataParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationVoid}
	 * labeled alternative in {@link AutomataParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationVoid(AutomataParser.FunctionDeclarationVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(AutomataParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionParameterDeclaration}
	 * labeled alternative in {@link AutomataParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterDeclaration(AutomataParser.FunctionParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionParameterDeclarationBasic}
	 * labeled alternative in {@link AutomataParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterDeclarationBasic(AutomataParser.FunctionParameterDeclarationBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AutomataParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#function_return_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return_types(AutomataParser.Function_return_typesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintExpressionNumeric}
	 * labeled alternative in {@link AutomataParser#print_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpressionNumeric(AutomataParser.PrintExpressionNumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpressionIf}
	 * labeled alternative in {@link AutomataParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionIf(AutomataParser.ConditionalExpressionIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpressionWhile}
	 * labeled alternative in {@link AutomataParser#conditional_loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionWhile(AutomataParser.ConditionalExpressionWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionParentheses(AutomataParser.LogicalExpressionParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionComparison}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionComparison(AutomataParser.LogicalExpressionComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionVariable}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionVariable(AutomataParser.LogicalExpressionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionAnd(AutomataParser.LogicalExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionNegation}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionNegation(AutomataParser.LogicalExpressionNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionBoolean}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionBoolean(AutomataParser.LogicalExpressionBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionOr(AutomataParser.LogicalExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionGreaterThan(AutomataParser.ComparisonExpressionGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionGreaterThanOrEqual(AutomataParser.ComparisonExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionLessThan(AutomataParser.ComparisonExpressionLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionLessThanOrEqual(AutomataParser.ComparisonExpressionLessThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionEqualTo}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionEqualTo(AutomataParser.ComparisonExpressionEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableNumericDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNumericDeclaration(AutomataParser.VariableNumericDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableNumericInitialization}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNumericInitialization(AutomataParser.VariableNumericInitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableBooleanDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBooleanDeclaration(AutomataParser.VariableBooleanDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableBooleanInitialization}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBooleanInitialization(AutomataParser.VariableBooleanInitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableNumericAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNumericAssignment(AutomataParser.VariableNumericAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableBooleanAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBooleanAssignment(AutomataParser.VariableBooleanAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionVariable}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionVariable(AutomataParser.MathExpressionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionParentheses(AutomataParser.MathExpressionParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx);
}