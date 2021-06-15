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
	 * Enter a parse tree produced by the {@code PrintCall}
	 * labeled alternative in {@link AutomataParser#print_call}.
	 * @param ctx the parse tree
	 */
	void enterPrintCall(AutomataParser.PrintCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCall}
	 * labeled alternative in {@link AutomataParser#print_call}.
	 * @param ctx the parse tree
	 */
	void exitPrintCall(AutomataParser.PrintCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopStructureWhile}
	 * labeled alternative in {@link AutomataParser#loop_structure}.
	 * @param ctx the parse tree
	 */
	void enterLoopStructureWhile(AutomataParser.LoopStructureWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopStructureWhile}
	 * labeled alternative in {@link AutomataParser#loop_structure}.
	 * @param ctx the parse tree
	 */
	void exitLoopStructureWhile(AutomataParser.LoopStructureWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalStructureIf}
	 * labeled alternative in {@link AutomataParser#conditional_structure}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStructureIf(AutomataParser.ConditionalStructureIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalStructureIf}
	 * labeled alternative in {@link AutomataParser#conditional_structure}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStructureIf(AutomataParser.ConditionalStructureIfContext ctx);
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
	 * Enter a parse tree produced by {@link AutomataParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AutomataParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AutomataParser.ParametersContext ctx);
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
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AutomataParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AutomataParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AutomataParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AutomataParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationDefault}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationDefault(AutomataParser.VariableDeclarationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationDefault}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationDefault(AutomataParser.VariableDeclarationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AutomataParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AutomataParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(AutomataParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(AutomataParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionLessThanOrEqual(AutomataParser.BooleanExpressionLessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionLessThanOrEqual(AutomataParser.BooleanExpressionLessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionDivision}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionDivision(AutomataParser.NumericExpressionDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionDivision}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionDivision(AutomataParser.NumericExpressionDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionTimes}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionTimes(AutomataParser.NumericExpressionTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionTimes}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionTimes(AutomataParser.NumericExpressionTimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionAdd}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionAdd(AutomataParser.NumericExpressionAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionAdd}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionAdd(AutomataParser.NumericExpressionAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionMinus}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionMinus(AutomataParser.NumericExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionMinus}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionMinus(AutomataParser.NumericExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpressionNegate}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionNegate(AutomataParser.BooleanExpressionNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpressionNegate}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionNegate(AutomataParser.BooleanExpressionNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionGreaterThanOrEqual(AutomataParser.BooleanExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionGreaterThanOrEqual(AutomataParser.BooleanExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpressionOr}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionOr(AutomataParser.BooleanExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpressionOr}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionOr(AutomataParser.BooleanExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionPower}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionPower(AutomataParser.NumericExpressionPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionPower}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionPower(AutomataParser.NumericExpressionPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionFactorial(AutomataParser.NumericExpressionFactorialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionFactorial(AutomataParser.NumericExpressionFactorialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(AutomataParser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(AutomataParser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericExpressionNegate}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpressionNegate(AutomataParser.NumericExpressionNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericExpressionNegate}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpressionNegate(AutomataParser.NumericExpressionNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParentheses(AutomataParser.ExpressionParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParentheses(AutomataParser.ExpressionParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionGreaterThan(AutomataParser.BooleanExpressionGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionGreaterThan(AutomataParser.BooleanExpressionGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpressionEqualTo}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionEqualTo(AutomataParser.BooleanExpressionEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpressionEqualTo}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionEqualTo(AutomataParser.BooleanExpressionEqualToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionFunctionCall}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionFunctionCall(AutomataParser.ExpressionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionFunctionCall}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionFunctionCall(AutomataParser.ExpressionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpressionAnd}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionAnd(AutomataParser.BooleanExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpressionAnd}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionAnd(AutomataParser.BooleanExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionLessThan(AutomataParser.BooleanExpressionLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionLessThan(AutomataParser.BooleanExpressionLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueVariable(AutomataParser.ValueVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueVariable(AutomataParser.ValueVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueBoolean(AutomataParser.ValueBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueBoolean(AutomataParser.ValueBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueNumber(AutomataParser.ValueNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueNumber(AutomataParser.ValueNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataParser#value_type}.
	 * @param ctx the parse tree
	 */
	void enterValue_type(AutomataParser.Value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#value_type}.
	 * @param ctx the parse tree
	 */
	void exitValue_type(AutomataParser.Value_typeContext ctx);
}