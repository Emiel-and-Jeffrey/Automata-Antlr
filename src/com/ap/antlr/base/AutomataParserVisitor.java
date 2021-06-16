// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\AutomataParser.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by the {@code FunctionDeclarationReturn}
	 * labeled alternative in {@link AutomataParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationReturn(AutomataParser.FunctionDeclarationReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationVoid}
	 * labeled alternative in {@link AutomataParser#function_declaration}.
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
	 * Visit a parse tree produced by the {@code ArgumentNumberExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentNumberExpression(AutomataParser.ArgumentNumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentBoolExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentBoolExpression(AutomataParser.ArgumentBoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentVariable}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentVariable(AutomataParser.ArgumentVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentFunction}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentFunction(AutomataParser.ArgumentFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentNumericExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentNumericExpression(AutomataParser.ArgumentNumericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentLogicalExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentLogicalExpression(AutomataParser.ArgumentLogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AutomataParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#value_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_types(AutomataParser.Value_typesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnVariable}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVariable(AutomataParser.ReturnVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnFunction}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(AutomataParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnLogicExpression}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnLogicExpression(AutomataParser.ReturnLogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnNumericExpression}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnNumericExpression(AutomataParser.ReturnNumericExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code LogicalExpressionFunction}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionFunction(AutomataParser.LogicalExpressionFunctionContext ctx);
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
	 * Visit a parse tree produced by the {@code MathExpressionFunction}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionFunction(AutomataParser.MathExpressionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx);
}