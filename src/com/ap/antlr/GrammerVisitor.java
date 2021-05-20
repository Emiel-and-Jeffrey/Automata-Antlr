// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammer\Grammer.g4 by ANTLR 4.9.1
package com.ap.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionSum(GrammerParser.MathExpressionSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionBasicNumber(GrammerParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionTimes(GrammerParser.MathExpressionTimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionMinus(GrammerParser.MathExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionFactorial(GrammerParser.MathExpressionFactorialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionParanthesis}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionParanthesis(GrammerParser.MathExpressionParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionPower(GrammerParser.MathExpressionPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link GrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionDivision(GrammerParser.MathExpressionDivisionContext ctx);
}