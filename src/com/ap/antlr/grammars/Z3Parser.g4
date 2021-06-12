parser grammar Z3Parser;
options { tokenVocab= Z3Lexer; }

result
    : SAT LPAREN MODEL statement* RPAREN;

statement
    : LPAREN function statement* RPAREN                                          #StatementFunction
    | LPAREN IF_ELSE LPAREN logical_expression RPAREN statement statement RPAREN #StatementIfElse
    | numeric_expression                                                         #StatementNumber;


function
    : FUNC IDENTIFIER LPAREN parameter* RPAREN types;

parameter
    : LPAREN IDENTIFIER types RPAREN;

logical_expression
	: AND  LPAREN logical_expression RPAREN LPAREN  logical_expression RPAREN   # LogicalExpressionAnd
	| comparison_expression                                                     # LogicalExpressionComparison;

numeric_expression
    : IDENTIFIER                                                                # MathExpressionVariable
	| NUMBER                                                                    # MathExpressionBasicNumber;

comparison_expression
    : IDENTIFIER                                                                # ComparisonExpressionVariable
    | GREATER_THAN numeric_expression numeric_expression                        # ComparisonExpressionGreaterThan
    | GREATER_THAN_OR_EQUAL numeric_expression numeric_expression               # ComparisonExpressionGreaterThanOrEqual
    | LESS_THAN numeric_expression numeric_expression                           # ComparisonExpressionLessThan
    | LESS_THAN_OR_EQUAL numeric_expression numeric_expression                  # ComparisonExpressionLessThanOrEqual
    | EQUALS  numeric_expression numeric_expression                             # ComparisonExpressionEqualTo;

types
    : INT;


