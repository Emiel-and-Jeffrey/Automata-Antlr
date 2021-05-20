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
	 * Visit a parse tree produced by the {@code MathExpressionSum}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionBasicNumber}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionTimes}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionMinus}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionFactorial}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionParentheses}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionParentheses(AutomataParser.MathExpressionParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionPower}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpressionDivision}
	 * labeled alternative in {@link AutomataParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx);
}