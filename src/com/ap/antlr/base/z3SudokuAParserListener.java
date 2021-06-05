// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\z3SudokuAParser.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link z3SudokuAParser}.
 */
public interface z3SudokuAParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link z3SudokuAParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(z3SudokuAParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link z3SudokuAParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(z3SudokuAParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link z3SudokuAParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(z3SudokuAParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link z3SudokuAParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(z3SudokuAParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link z3SudokuAParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(z3SudokuAParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link z3SudokuAParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(z3SudokuAParser.FieldContext ctx);
}