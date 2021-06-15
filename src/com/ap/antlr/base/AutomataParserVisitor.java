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
	 * Visit a parse tree produced by the {@code PrintCall}
	 * labeled alternative in {@link AutomataParser#print_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCall(AutomataParser.PrintCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopStructureWhile}
	 * labeled alternative in {@link AutomataParser#loop_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStructureWhile(AutomataParser.LoopStructureWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalStructureIf}
	 * labeled alternative in {@link AutomataParser#conditional_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStructureIf(AutomataParser.ConditionalStructureIfContext ctx);
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
	 * Visit a parse tree produced by {@link AutomataParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AutomataParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AutomataParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AutomataParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AutomataParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationDefault}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationDefault(AutomataParser.VariableDeclarationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link AutomataParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AutomataParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(AutomataParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionLessThanOrEqual(AutomataParser.BooleanExpressionLessThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericExpressionDivision}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpressionDivision(AutomataParser.NumericExpressionDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericExpressionTimes}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpressionTimes(AutomataParser.NumericExpressionTimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericExpressionAdd}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpressionAdd(AutomataParser.NumericExpressionAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericExpressionMinus}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpressionMinus(AutomataParser.NumericExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpressionNegate}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionNegate(AutomataParser.BooleanExpressionNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionGreaterThanOrEqual(AutomataParser.BooleanExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpressionOr}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionOr(AutomataParser.BooleanExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericExpressionPower}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpressionPower(AutomataParser.NumericExpressionPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpressionFactorial(AutomataParser.NumericExpressionFactorialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(AutomataParser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericExpressionNegate}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpressionNegate(AutomataParser.NumericExpressionNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParentheses(AutomataParser.ExpressionParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionGreaterThan(AutomataParser.BooleanExpressionGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpressionEqualTo}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionEqualTo(AutomataParser.BooleanExpressionEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionFunctionCall}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionFunctionCall(AutomataParser.ExpressionFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpressionAnd}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionAnd(AutomataParser.BooleanExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionLessThan(AutomataParser.BooleanExpressionLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVariable(AutomataParser.ValueVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBoolean(AutomataParser.ValueBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link AutomataParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueNumber(AutomataParser.ValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#value_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_type(AutomataParser.Value_typeContext ctx);
}