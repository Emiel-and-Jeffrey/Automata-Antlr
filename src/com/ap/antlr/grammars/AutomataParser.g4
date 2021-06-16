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
    | function_declaration
    | function_call SEMICOLON
    | variable_declaration SEMICOLON
    | variable_assignment SEMICOLON;

// Function rules
function_declaration
    : value_types IDENTIFIER LEFT_PARENTHESIS parameter* RIGHT_PARENTHESIS LEFT_BRACE statement* RETURN return_expression SEMICOLON RIGHT_BRACE #FunctionDeclarationReturn
    | TYPE_VOID IDENTIFIER LEFT_PARENTHESIS parameter* RIGHT_PARENTHESIS LEFT_BRACE statement* RIGHT_BRACE                                      #FunctionDeclarationVoid;

function_call
    :  IDENTIFIER LEFT_PARENTHESIS argument* RIGHT_PARENTHESIS;

argument
    : NUMBER COMMA              #ArgumentNumberExpression
    | BOOLEAN COMMA             #ArgumentBoolExpression
    | IDENTIFIER COMMA          #ArgumentVariable
    | function_call COMMA       #ArgumentFunction
    | numeric_expression COMMA  #ArgumentNumericExpression
    | logical_expression COMMA  #ArgumentLogicalExpression
    | NUMBER                    #ArgumentNumberExpression
    | BOOLEAN                   #ArgumentBoolExpression
    | IDENTIFIER                #ArgumentVariable
    | function_call             #ArgumentFunction
    | numeric_expression        #ArgumentNumericExpression
    | logical_expression        #ArgumentLogicalExpression;

parameter
    : value_types IDENTIFIER COMMA
    | value_types IDENTIFIER;

value_types
    : VARIABLE_TYPE_NUMBER
    | VARIABLE_TYPE_BOOLEAN
    | VARIABLE_TYPE_STRING;

return_expression
    : IDENTIFIER            #ReturnVariable
    | function_call         #ReturnFunction
    | logical_expression    #ReturnLogicExpression
    | numeric_expression    #ReturnNumericExpression;

print_expression
    : PRINT numeric_expression                                                                                                  #PrintExpressionNumeric;

// Logic rules
conditional_expression
    : IF logical_expression THEN statement_block (ELSE IF logical_expression THEN statement_block)* (ELSE statement_block)? FI  #ConditionalExpressionIf;

conditional_loop_expression
    : WHILE logical_expression THEN statement_block ELIHW                                                                       #ConditionalExpressionWhile;

logical_expression
    : BOOLEAN                                                                                                                   # LogicalExpressionBoolean
    | IDENTIFIER                                                                                                                # LogicalExpressionVariable
    | function_call                                                                                                             # LogicalExpressionFunction
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

// Variable rules
variable_declaration
    : VARIABLE_TYPE_NUMBER IDENTIFIER                                                                                           #VariableNumericDeclaration
    | VARIABLE_TYPE_NUMBER IDENTIFIER EQUALS numeric_expression                                                                 #VariableNumericInitialization
    | VARIABLE_TYPE_BOOLEAN IDENTIFIER                                                                                          #VariableBooleanDeclaration
    | VARIABLE_TYPE_BOOLEAN IDENTIFIER EQUALS logical_expression                                                                #VariableBooleanInitialization;

variable_assignment
    : IDENTIFIER EQUALS numeric_expression                                                                                      #VariableNumericAssignment
    | IDENTIFIER EQUALS logical_expression                                                                                      #VariableBooleanAssignment;

// Numeric rules
numeric_expression
    : IDENTIFIER                                                                                                                # MathExpressionVariable
	| NUMBER                                                                                                                    # MathExpressionBasicNumber
	| function_call                                                                                                             # MathExpressionFunction
	| LEFT_PARENTHESIS numeric_expression RIGHT_PARENTHESIS                                                                     # MathExpressionParentheses
	| numeric_expression EXLAMATION_MARK                                                                                        # MathExpressionFactorial
    | numeric_expression POWER numeric_expression                                                                               # MathExpressionPower
	| numeric_expression TIMES numeric_expression                                                                               # MathExpressionTimes
    | numeric_expression DIVISION numeric_expression                                                                            # MathExpressionDivision
	| numeric_expression ADD numeric_expression                                                                                 # MathExpressionSum
	| numeric_expression MINUS numeric_expression                                                                               # MathExpressionMinus;


