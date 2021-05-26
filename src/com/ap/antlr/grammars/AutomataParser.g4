parser grammar AutomataParser;
options { tokenVocab= AutomataLexer; }

program: statement*;

statement
    : variable_declaration
    | variable_assignment
    | print_expression;

variable_declaration
    : VARIABLE_TYPE_NUMBER IDENTIFIER                           #VariableNumericDeclaration
    | VARIABLE_TYPE_NUMBER IDENTIFIER EQUALS numeric_expression #VariableNumericInitialization;

variable_assignment
    : IDENTIFIER EQUALS numeric_expression;

numeric_expression
    : IDENTIFIER                                            # MathExpressionVariable // Variable
	| NUMBER                                                # MathExpressionBasicNumber // Number
	| LEFT_PARENTHESIS numeric_expression RIGHT_PARENTHESIS # MathExpressionParentheses // Parenthesis
	| numeric_expression FACTORIAL                          # MathExpressionFactorial // Factorial
	| numeric_expression POWER numeric_expression           # MathExpressionPower // Power
	| numeric_expression TIMES numeric_expression           # MathExpressionTimes // Times
    | numeric_expression DIVISION numeric_expression        # MathExpressionDivision // Division
	| numeric_expression ADD numeric_expression             # MathExpressionSum // Sum
	| numeric_expression MINUS numeric_expression           # MathExpressionMinus; // Minus

//number a = 15

//print 15 + a
//print
//+
//15
//a

//boolean_expression

//string_expression

print_expression: PRINT numeric_expression;