ECHO OFF
ECHO Starting antlr
CALL antlr4 BaseGrammer.g4 -o .antlr
ECHO antlr4 finished 
ECHO Compiling java code
cd .antlr
CALL javac BaseGrammer*.java
ECHO Compilation finished
ECHO Starting program
ECHO Program started enter sentence
CALL grun BaseGrammer program -gui