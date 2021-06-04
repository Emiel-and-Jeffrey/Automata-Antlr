// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\RuleSetGrammar.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RuleSetGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuleSetGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#rule_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_set(RuleSetGrammarParser.Rule_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#single_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_rule(RuleSetGrammarParser.Single_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(RuleSetGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(RuleSetGrammarParser.ConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalEntity(RuleSetGrammarParser.LogicalEntityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(RuleSetGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionInParen(RuleSetGrammarParser.LogicalExpressionInParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionAnd(RuleSetGrammarParser.LogicalExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionOr(RuleSetGrammarParser.LogicalExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionWithOperator(RuleSetGrammarParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionInParen(RuleSetGrammarParser.ComparisonExpressionInParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operand(RuleSetGrammarParser.Comparison_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_operator(RuleSetGrammarParser.Comp_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionMult(RuleSetGrammarParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionInParen(RuleSetGrammarParser.ArithmeticExpressionInParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionMin}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionMin(RuleSetGrammarParser.ArithmeticExpressionMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionNumericEntity(RuleSetGrammarParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionDiv(RuleSetGrammarParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionPlus(RuleSetGrammarParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionNegation(RuleSetGrammarParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConst(RuleSetGrammarParser.LogicalConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalVariable(RuleSetGrammarParser.LogicalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConst(RuleSetGrammarParser.NumericConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericVariable(RuleSetGrammarParser.NumericVariableContext ctx);
}