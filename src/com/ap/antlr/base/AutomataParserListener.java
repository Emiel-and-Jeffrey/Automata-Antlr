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
	 * Enter a parse tree produced by {@link AutomataParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expression(AutomataParser.Print_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expression(AutomataParser.Print_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link AutomataParser#conditional_loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_loop_expression(AutomataParser.Conditional_loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataParser#conditional_loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_loop_expression(AutomataParser.Conditional_loop_expressionContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableBooleanAssignmetn}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableBooleanAssignmetn(AutomataParser.VariableBooleanAssignmetnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableBooleanAssignmetn}
	 * labeled alternative in {@link AutomataParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableBooleanAssignmetn(AutomataParser.VariableBooleanAssignmetnContext ctx);
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
	 * Enter a parse tree produced by the {@code ComparisionExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisionExpressionGreaterThan(AutomataParser.ComparisionExpressionGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisionExpressionGreaterThan}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisionExpressionGreaterThan(AutomataParser.ComparisionExpressionGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisionExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisionExpressionGreaterThanOrEqual(AutomataParser.ComparisionExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisionExpressionGreaterThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisionExpressionGreaterThanOrEqual(AutomataParser.ComparisionExpressionGreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisionExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisionExpressionLessThan(AutomataParser.ComparisionExpressionLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisionExpressionLessThan}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisionExpressionLessThan(AutomataParser.ComparisionExpressionLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisionExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisionExpressionLessThanOrEqual(AutomataParser.ComparisionExpressionLessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisionExpressionLessThanOrEqual}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisionExpressionLessThanOrEqual(AutomataParser.ComparisionExpressionLessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisionExpressionEqualTo}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisionExpressionEqualTo(AutomataParser.ComparisionExpressionEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisionExpressionEqualTo}
	 * labeled alternative in {@link AutomataParser#comparision_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisionExpressionEqualTo(AutomataParser.ComparisionExpressionEqualToContext ctx);
}