// Generated from C:/Users/emiel/Desktop/semester 4/automata/Automata-Antlr/src/com/ap/antlr/grammars\RuleSetGrammar.g4 by ANTLR 4.9.1
package com.ap.antlr.base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleSetGrammarParser}.
 */
public interface RuleSetGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#rule_set}.
	 * @param ctx the parse tree
	 */
	void enterRule_set(RuleSetGrammarParser.Rule_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#rule_set}.
	 * @param ctx the parse tree
	 */
	void exitRule_set(RuleSetGrammarParser.Rule_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#single_rule}.
	 * @param ctx the parse tree
	 */
	void enterSingle_rule(RuleSetGrammarParser.Single_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#single_rule}.
	 * @param ctx the parse tree
	 */
	void exitSingle_rule(RuleSetGrammarParser.Single_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RuleSetGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RuleSetGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(RuleSetGrammarParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(RuleSetGrammarParser.ConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEntity(RuleSetGrammarParser.LogicalEntityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEntity(RuleSetGrammarParser.LogicalEntityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(RuleSetGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(RuleSetGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionInParen(RuleSetGrammarParser.LogicalExpressionInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionInParen(RuleSetGrammarParser.LogicalExpressionInParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionAnd(RuleSetGrammarParser.LogicalExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionAnd(RuleSetGrammarParser.LogicalExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionOr(RuleSetGrammarParser.LogicalExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionOr(RuleSetGrammarParser.LogicalExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionWithOperator(RuleSetGrammarParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionWithOperator(RuleSetGrammarParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionInParen(RuleSetGrammarParser.ComparisonExpressionInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionInParen(RuleSetGrammarParser.ComparisonExpressionInParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operand(RuleSetGrammarParser.Comparison_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operand(RuleSetGrammarParser.Comparison_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterComp_operator(RuleSetGrammarParser.Comp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitComp_operator(RuleSetGrammarParser.Comp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionMult(RuleSetGrammarParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionMult(RuleSetGrammarParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionInParen(RuleSetGrammarParser.ArithmeticExpressionInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionInParen(RuleSetGrammarParser.ArithmeticExpressionInParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionMin}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionMin(RuleSetGrammarParser.ArithmeticExpressionMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionMin}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionMin(RuleSetGrammarParser.ArithmeticExpressionMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionNumericEntity(RuleSetGrammarParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionNumericEntity(RuleSetGrammarParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionDiv(RuleSetGrammarParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionDiv(RuleSetGrammarParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionPlus(RuleSetGrammarParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionPlus(RuleSetGrammarParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionNegation(RuleSetGrammarParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionNegation(RuleSetGrammarParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConst(RuleSetGrammarParser.LogicalConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConst(RuleSetGrammarParser.LogicalConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogicalVariable(RuleSetGrammarParser.LogicalVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogicalVariable(RuleSetGrammarParser.LogicalVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumericConst(RuleSetGrammarParser.NumericConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumericConst(RuleSetGrammarParser.NumericConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumericVariable(RuleSetGrammarParser.NumericVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumericVariable(RuleSetGrammarParser.NumericVariableContext ctx);
}