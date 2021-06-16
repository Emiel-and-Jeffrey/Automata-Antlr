// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\AutomataParser.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by the {@code FunctionDeclarationReturn}
	 * labeled alternative in {@link AutomataParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationReturn(AutomataParser.FunctionDeclarationReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationReturn}
	 * labeled alternative in {@link AutomataParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationReturn(AutomataParser.FunctionDeclarationReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationVoid}
	 * labeled alternative in {@link AutomataParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationVoid(AutomataParser.FunctionDeclarationVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationVoid}
	 * labeled alternative in {@link AutomataParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationVoid(AutomataParser.FunctionDeclarationVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(AutomataParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(AutomataParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentNumberExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNumberExpression(AutomataParser.ArgumentNumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentNumberExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNumberExpression(AutomataParser.ArgumentNumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentBoolExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentBoolExpression(AutomataParser.ArgumentBoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentBoolExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentBoolExpression(AutomataParser.ArgumentBoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentVariable}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentVariable(AutomataParser.ArgumentVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentVariable}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentVariable(AutomataParser.ArgumentVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentFunction}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentFunction(AutomataParser.ArgumentFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentFunction}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentFunction(AutomataParser.ArgumentFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentNumericExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNumericExpression(AutomataParser.ArgumentNumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentNumericExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNumericExpression(AutomataParser.ArgumentNumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentLogicalExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentLogicalExpression(AutomataParser.ArgumentLogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentLogicalExpression}
	 * labeled alternative in {@link AutomataParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentLogicalExpression(AutomataParser.ArgumentLogicalExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link AutomataParser#value_types}.
	 * @param ctx the parse tree
	 */
	void enterValue_types(AutomataParser.Value_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#value_types}.
	 * @param ctx the parse tree
	 */
	void exitValue_types(AutomataParser.Value_typesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnVariable}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void enterReturnVariable(AutomataParser.ReturnVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVariable}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void exitReturnVariable(AutomataParser.ReturnVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnFunction}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(AutomataParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnFunction}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(AutomataParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnLogicExpression}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void enterReturnLogicExpression(AutomataParser.ReturnLogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnLogicExpression}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void exitReturnLogicExpression(AutomataParser.ReturnLogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnNumericExpression}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void enterReturnNumericExpression(AutomataParser.ReturnNumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnNumericExpression}
	 * labeled alternative in {@link AutomataParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void exitReturnNumericExpression(AutomataParser.ReturnNumericExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code LogicalExpressionFunction}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionFunction(AutomataParser.LogicalExpressionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionFunction}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionFunction(AutomataParser.LogicalExpressionFunctionContext ctx);
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
	 * Enter a parse tree produced by the {@code MathExpressionFunction}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionFunction(AutomataParser.MathExpressionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionFunction}
	 * labeled alternative in {@link AutomataParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionFunction(AutomataParser.MathExpressionFunctionContext ctx);
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