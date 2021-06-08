// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammars\AutomataParser.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutomataParser}.
 */
public interface AutomataParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutomataParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AutomataParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AutomataParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(AutomataParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(AutomataParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AutomataParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AutomataParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link AutomataParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AutomataParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link AutomataParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AutomataParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationVoid}
	 * labeled alternative in {@link AutomataParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationVoid(AutomataParser.FunctionDeclarationVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationVoid}
	 * labeled alternative in {@link AutomataParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationVoid(AutomataParser.FunctionDeclarationVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AutomataParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AutomataParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataParser#function_return_types}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return_types(AutomataParser.Function_return_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#function_return_types}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return_types(AutomataParser.Function_return_typesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpressionNumeric}
	 * labeled alternative in {@link AutomataParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpressionNumeric(AutomataParser.PrintExpressionNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpressionNumeric}
	 * labeled alternative in {@link AutomataParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpressionNumeric(AutomataParser.PrintExpressionNumericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpressionIf}
	 * labeled alternative in {@link AutomataParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpressionIf(AutomataParser.ConditionalExpressionIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpressionIf}
	 * labeled alternative in {@link AutomataParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpressionIf(AutomataParser.ConditionalExpressionIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpressionWhile}
	 * labeled alternative in {@link AutomataParser#conditional_loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpressionWhile(AutomataParser.ConditionalExpressionWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpressionWhile}
	 * labeled alternative in {@link AutomataParser#conditional_loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpressionWhile(AutomataParser.ConditionalExpressionWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionParentheses(AutomataParser.LogicalExpressionParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionParentheses(AutomataParser.LogicalExpressionParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionComparison}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionComparison(AutomataParser.LogicalExpressionComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionComparison}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionComparison(AutomataParser.LogicalExpressionComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionVariable}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionVariable(AutomataParser.LogicalExpressionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionVariable}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionVariable(AutomataParser.LogicalExpressionVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionAnd(AutomataParser.LogicalExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionAnd(AutomataParser.LogicalExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionNegation}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionNegation(AutomataParser.LogicalExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionNegation}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionNegation(AutomataParser.LogicalExpressionNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionBoolean}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionBoolean(AutomataParser.LogicalExpressionBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionBoolean}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionBoolean(AutomataParser.LogicalExpressionBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionOr(AutomataParser.LogicalExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionOr(AutomataParser.LogicalExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionGreaterThan(AutomataParser.ComparisonExpressionGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionGreaterThan(AutomataParser.ComparisonExpressionGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionGreaterThanOrEqual(AutomataParser.ComparisonExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionGreaterThanOrEqual(AutomataParser.ComparisonExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionLessThan(AutomataParser.ComparisonExpressionLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionLessThan(AutomataParser.ComparisonExpressionLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionLessThanOrEqual(AutomataParser.ComparisonExpressionLessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionLessThanOrEqual(AutomataParser.ComparisonExpressionLessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionEqualTo}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionEqualTo(AutomataParser.ComparisonExpressionEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionEqualTo}
	 * labeled alternative in {@link AutomataParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionEqualTo(AutomataParser.ComparisonExpressionEqualToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableNumericDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableNumericDeclaration(AutomataParser.VariableNumericDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableNumericDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableNumericDeclaration(AutomataParser.VariableNumericDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableNumericInitialization}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableNumericInitialization(AutomataParser.VariableNumericInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableNumericInitialization}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableNumericInitialization(AutomataParser.VariableNumericInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableBooleanDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableBooleanDeclaration(AutomataParser.VariableBooleanDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableBooleanDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableBooleanDeclaration(AutomataParser.VariableBooleanDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableBooleanInitialization}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableBooleanInitialization(AutomataParser.VariableBooleanInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableBooleanInitialization}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableBooleanInitialization(AutomataParser.VariableBooleanInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableNumericAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableNumericAssignment(AutomataParser.VariableNumericAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableNumericAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableNumericAssignment(AutomataParser.VariableNumericAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableBooleanAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableBooleanAssignment(AutomataParser.VariableBooleanAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableBooleanAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableBooleanAssignment(AutomataParser.VariableBooleanAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionSum(AutomataParser.MathExpressionSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionVariable}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionVariable(AutomataParser.MathExpressionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionVariable}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionVariable(AutomataParser.MathExpressionVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionParentheses(AutomataParser.MathExpressionParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionParentheses(AutomataParser.MathExpressionParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx);
}