package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseListener;
import com.ap.automata.SymbolTable.Symbol;
import com.ap.automata.SymbolTable.SymbolTable;
import com.ap.automata.SymbolTable.VariableType;
import com.ap.automata.SymbolTable.exceptions.VariableAlreadyDefinedException;

public class VariableParserListener extends AutomataParserBaseListener {

    private SymbolTable symbolTable;

    public VariableParserListener(SymbolTable table) {
        symbolTable = table;
    }

    @Override
    public void exitVariableNumericDeclaration(AutomataParser.VariableNumericDeclarationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Double variableValue = 0.0;
        Symbol symbol = new Symbol(variableName, VariableType.NUMBER, variableValue.toString());

        try {
            symbolTable.AddSymbol(symbol);
        } catch (VariableAlreadyDefinedException e) {
            throw new Error(e.getMessage());
        }
    }
}
