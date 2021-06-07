// Generated from B:/Code/School/Jaar 2/Semester 4/Automata/src/com/ap/antlr/grammars\Z3Parser.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Z3Parser}.
 */
public interface Z3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Z3Parser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(Z3Parser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(Z3Parser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Z3Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Z3Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3Parser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(Z3Parser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3Parser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(Z3Parser.FieldContext ctx);
}