parser grammar AutomataParser;
options { tokenVocab= AutomataLexer; }

program
    : statement_block EOF;

statement_block
    : statement*;

//statements are standalone units of execution, they do not produce anything
statement
    : print_call SEMICOLON
    | loop_structure
    | conditional_structure
    | function_declaration
    | function_call SEMICOLON
    | variable_declaration SEMICOLON
    | variable_assignment SEMICOLON;
    //todo: see if you can implement return statement

print_call
    : PRINT expression #PrintCall;


loop_structure
    : WHILE expression THEN statement_block ELIHW #LoopStructureWhile;

conditional_structure
    : IF expression THEN statement_block (ELSE IF expression THEN statement_block)* (ELSE statement_block)? FI #ConditionalStructureIf;

function_declaration
    : value_type IDENTIFIER LEFT_PARENTHESIS ?parameters RIGHT_PARENTHESIS LEFT_BRACE statement_block RETURN expression SEMICOLON RIGHT_BRACE   #FunctionDeclarationReturn
    | TYPE_VOID IDENTIFIER LEFT_PARENTHESIS ?parameters RIGHT_PARENTHESIS LEFT_BRACE statement_block RIGHT_BRACE                                #FunctionDeclarationVoid;

parameters
    : parameter (COMMA parameter)*;

parameter
    : value_type IDENTIFIER;

function_call
    :  IDENTIFIER LEFT_PARENTHESIS expression* RIGHT_PARENTHESIS #FunctionCall;

variable_declaration
    : value_type IDENTIFIER                     #VariableDeclarationDefault
    | value_type IDENTIFIER EQUALS expression   #VariableDeclaration;

variable_assignment
    : IDENTIFIER EQUALS expression #VariableAssignment;

//expressions are logical statements with the purpose of producing a new value
expression
    : value                                         #ExpressionValue
    | function_call                                 #ExpressionFunctionCall
    | LEFT_PARENTHESIS expression RIGHT_PARENTHESIS #ExpressionParentheses
    //numeric expressions
    | expression ADD expression                     #NumericExpressionAdd
    | expression MINUS expression                   #NumericExpressionMinus
    | expression TIMES expression                   #NumericExpressionTimes
    | expression DIVISION expression                #NumericExpressionDivision
    | expression POWER expression                   #NumericExpressionPower
    | expression EXCLAMATION_MARK                   #NumericExpressionFactorial
    | MINUS expression                              #NumericExpressionNegate
    //boolean expressions
    | expression AND expression                     #BooleanExpressionAnd
    | expression OR expression                      #BooleanExpressionOr
    | EXCLAMATION_MARK expression                   #BooleanExpressionNegate
    | expression GREATER_THAN expression            #BooleanExpressionGreaterThan
    | expression GREATER_THAN_OR_EQUAL expression   #BooleanExpressionGreaterThanOrEqual
    | expression LESS_THAN expression               #BooleanExpressionLessThan
    | expression LESS_THAN_OR_EQUAL expression      #BooleanExpressionLessThanOrEqual
    | expression EQUAL_TO expression                #BooleanExpressionEqualTo;

value
    : IDENTIFIER    #ValueVariable
    | BOOLEAN       #ValueBoolean
    | NUMBER        #ValueNumber;

value_type
    : VALUE_TYPE_NUMBER
    | VALUE_TYPE_BOOLEAN;


