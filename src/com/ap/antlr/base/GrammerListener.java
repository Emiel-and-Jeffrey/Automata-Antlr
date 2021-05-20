// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\Grammer.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammerParser}.
 */
public interface GrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionSum(GrammerParser.MathExpressionSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionSum(GrammerParser.MathExpressionSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionBasicNumber(GrammerParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionBasicNumber(GrammerParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionTimes(GrammerParser.MathExpressionTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionTimes(GrammerParser.MathExpressionTimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionMinus(GrammerParser.MathExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionMinus(GrammerParser.MathExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionFactorial(GrammerParser.MathExpressionFactorialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionFactorial(GrammerParser.MathExpressionFactorialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionParanthesis}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionParanthesis(GrammerParser.MathExpressionParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionParanthesis}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionParanthesis(GrammerParser.MathExpressionParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionPower(GrammerParser.MathExpressionPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionPower(GrammerParser.MathExpressionPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionDivision(GrammerParser.MathExpressionDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionDivision(GrammerParser.MathExpressionDivisionContext ctx);
}