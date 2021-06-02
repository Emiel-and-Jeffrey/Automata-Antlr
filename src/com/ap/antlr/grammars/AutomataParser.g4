parser grammar AutomataParser;
options { tokenVocab= AutomataLexer; }

program
    : statement* EOF;

statement
    : print_expression SEMICOLON
    | conditional_expression
    | conditional_loop_expression
    | variable_declaration SEMICOLON
    | variable_assignment SEMICOLON;

print_expression
    : PRINT numeric_expression;

conditional_expression
    : IF logical_expression THEN statement* FI                      #ConditionalExpressionIf;

conditional_loop_expression
    : WHILE logical_expression THEN statement* ELIHW;

variable_declaration
    : VARIABLE_TYPE_NUMBER IDENTIFIER                               #VariableNumericDeclaration
    | VARIABLE_TYPE_NUMBER IDENTIFIER EQUALS numeric_expression     #VariableNumericInitialization
    | VARIABLE_TYPE_BOOLEAN IDENTIFIER                              #VariableBooleanDeclaration
    | VARIABLE_TYPE_BOOLEAN IDENTIFIER EQUALS logical_expression    #VariableBooleanInitialization;

variable_assignment
    : IDENTIFIER EQUALS numeric_expression                          #VariableNumericAssignment
    | IDENTIFIER EQUALS logical_expression                          #VariableBooleanAssignment;

numeric_expression
    : IDENTIFIER                                                    # MathExpressionVariable // Variable
	| NUMBER                                                        # MathExpressionBasicNumber // Number
	| LEFT_PARENTHESIS numeric_expression RIGHT_PARENTHESIS         # MathExpressionParentheses // Parenthesis
	| numeric_expression FACTORIAL                                  # MathExpressionFactorial // Factorial
	| numeric_expression POWER numeric_expression                   # MathExpressionPower // Power
	| numeric_expression TIMES numeric_expression                   # MathExpressionTimes // Times
    | numeric_expression DIVISION numeric_expression                # MathExpressionDivision // Division
	| numeric_expression ADD numeric_expression                     # MathExpressionSum // Sum
	| numeric_expression MINUS numeric_expression                   # MathExpressionMinus; // Minus

logical_expression
    : IDENTIFIER                                                    # LogicalExpressionVariable
    | BOOLEAN                                                       # LogicalExpressionBoolean
	| LEFT_PARENTHESIS logical_expression RIGHT_PARENTHESIS         # LogicalExpressionParentheses
	| logical_expression AND logical_expression                     # LogicalExpressionAnd
	| logical_expression OR logical_expression                      # LogicalExpressionOr
	| comparision_expression                                        # LogicalExpressionComparison
	| NEGATION logical_expression                                   # LogicalExpressionNegation;

comparision_expression
    : numeric_expression GREATER_THAN numeric_expression            # ComparisionExpressionGreaterThan
    | numeric_expression GREATER_THAN_OR_EQUAL numeric_expression   # ComparisionExpressionGreaterThanOrEqual
    | numeric_expression LESS_THAN numeric_expression               # ComparisionExpressionLessThan
    | numeric_expression LESS_THAN_OR_EQUAL numeric_expression      # ComparisionExpressionLessThanOrEqual
    | numeric_expression EQUAL_TO numeric_expression                # ComparisionExpressionEqualTo;

