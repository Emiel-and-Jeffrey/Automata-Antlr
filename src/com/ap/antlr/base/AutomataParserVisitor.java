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
	 * Visit a parse tree produced by {@link AutomataParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AutomataParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#print_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expression(AutomataParser.Print_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpressionIf}
	 * labeled alternative in {@link AutomataParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionIf(AutomataParser.ConditionalExpressionIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpressionElseIf}
	 * labeled alternative in {@link AutomataParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionElseIf(AutomataParser.ConditionalExpressionElseIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpressionElse}
	 * labeled alternative in {@link AutomataParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionElse(AutomataParser.ConditionalExpressionElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomataParser#conditional_loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_loop_expression(AutomataParser.Conditional_loop_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(AutomataParser.Variable_assignmentContext ctx);
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
	 * Visit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link AutomataParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionOr(AutomataParser.LogicalExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisionExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisionExpressionGreaterThan(AutomataParser.ComparisionExpressionGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisionExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisionExpressionGreaterThanOrEqual(AutomataParser.ComparisionExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisionExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisionExpressionLessThan(AutomataParser.ComparisionExpressionLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisionExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisionExpressionLessThanOrEqual(AutomataParser.ComparisionExpressionLessThanOrEqualContext ctx);
}