parser grammar Z3Parser;
options { tokenVocab= Z3Lexer; }

result
    : SAT LPAREN MODEL statement* RPAREN;

statement
    : LPAREN function statement* RPAREN                                          #StatementFunction
    | LPAREN IF_ELSE LPAREN logical_expression RPAREN statement statement RPAREN #StatementIfElse
    | value                                                                      #StatementNumber;


function
    : FUNC IDENTIFIER LPAREN parameter* RPAREN types;

parameter
    : LPAREN IDENTIFIER types RPAREN;

logical_expression
	: AND  (LPAREN value RPAREN)*  # LogicalExpressionAnd
	| OR   (LPAREN value RPAREN)*   # LogicalExpressionOr
	| NOT  (LPAREN value RPAREN)   # LogicalExpressionNot;

value
    : IDENTIFIER                                                                # ValueVariable
    | STRING_LITERAL                                                            # ValueString
	| NUMBER                                                                    # ValueBasicNumber
	| comparison_expression                                                     # ValueComparisonExpresssion;

comparison_expression
    : GREATER_THAN value value                        # ComparisonExpressionGreaterThan
    | GREATER_THAN_OR_EQUAL value value               # ComparisonExpressionGreaterThanOrEqual
    | LESS_THAN value value                           # ComparisonExpressionLessThan
    | LESS_THAN_OR_EQUAL value value                  # ComparisonExpressionLessThanOrEqual
    | EQUALS value*                                  # ComparisonExpressionEqualTo;

types
    : INT
    | STRING
    | BOOL;


