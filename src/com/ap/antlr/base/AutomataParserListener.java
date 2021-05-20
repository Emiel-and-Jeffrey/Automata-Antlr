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
	 * Enter a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionSum(AutomataParser.MathExpressionSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionParanthesis}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionParanthesis(AutomataParser.MathExpressionParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionParanthesis}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionParanthesis(AutomataParser.MathExpressionParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx);
}