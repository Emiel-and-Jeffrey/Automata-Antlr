parser grammar AutomataParser;
options { tokenVocab= AutomataLexer; }

program
    : statement_block EOF;

statement_block
    : statement*;

statement
    : print_expression SEMICOLON
    | conditional_expression
    | conditional_loop_expression
    | variable_declaration SEMICOLON
    | variable_assignment SEMICOLON;

print_expression
    : PRINT numeric_expression                                                                                                  #PrintExpressionNumeric;

conditional_expression
    : IF logical_expression THEN statement_block (ELSE IF logical_expression THEN statement_block)* (ELSE statement_block)? FI  #ConditionalExpressionIf;

conditional_loop_expression
    : WHILE logical_expression THEN statement_block ELIHW                                                                       #ConditionalExpressionWhile;

variable_declaration
    : VARIABLE_TYPE_NUMBER IDENTIFIER                                                                                           #VariableNumericDeclaration
    | VARIABLE_TYPE_NUMBER IDENTIFIER EQUALS numeric_expression                                                                 #VariableNumericInitialization
    | VARIABLE_TYPE_BOOLEAN IDENTIFIER                                                                                          #VariableBooleanDeclaration
    | VARIABLE_TYPE_BOOLEAN IDENTIFIER EQUALS logical_expression                                                                #VariableBooleanInitialization;

variable_assignment
    : IDENTIFIER EQUALS numeric_expression                                                                                      #VariableNumericAssignment
    | IDENTIFIER EQUALS logical_expression                                                                                      #VariableBooleanAssignment;

numeric_expression
    : IDENTIFIER                                                                                                                # MathExpressionVariable
	| NUMBER                                                                                                                    # MathExpressionBasicNumber
	| LEFT_PARENTHESIS numeric_expression RIGHT_PARENTHESIS                                                                     # MathExpressionParentheses
	| numeric_expression EXLAMATION_MARK                                                                                        # MathExpressionFactorial
    | numeric_expression POWER numeric_expression                                                                               # MathExpressionPower
	| numeric_expression TIMES numeric_expression                                                                               # MathExpressionTimes
    | numeric_expression DIVISION numeric_expression                                                                            # MathExpressionDivision
	| numeric_expression ADD numeric_expression                                                                                 # MathExpressionSum
	| numeric_expression MINUS numeric_expression                                                                               # MathExpressionMinus;

logical_expression
    : IDENTIFIER                                                                                                                # LogicalExpressionVariable
    | BOOLEAN                                                                                                                   # LogicalExpressionBoolean
	| LEFT_PARENTHESIS logical_expression RIGHT_PARENTHESIS                                                                     # LogicalExpressionParentheses
	| logical_expression AND logical_expression                                                                                 # LogicalExpressionAnd
	| logical_expression OR logical_expression                                                                                  # LogicalExpressionOr
	| comparison_expression                                                                                                     # LogicalExpressionComparison
	| EXLAMATION_MARK logical_expression                                                                                        # LogicalExpressionNegation;

comparison_expression
    : numeric_expression GREATER_THAN numeric_expression                                                                        # ComparisonExpressionGreaterThan
    | numeric_expression GREATER_THAN_OR_EQUAL numeric_expression                                                               # ComparisonExpressionGreaterThanOrEqual
    | numeric_expression LESS_THAN numeric_expression                                                                           # ComparisonExpressionLessThan
    | numeric_expression LESS_THAN_OR_EQUAL numeric_expression                                                                  # ComparisonExpressionLessThanOrEqual
    | numeric_expression EQUAL_TO numeric_expression                                                                            # ComparisonExpressionEqualTo;

