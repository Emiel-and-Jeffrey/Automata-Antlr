package com.ap.automata.SymbolTable.symbol;

import com.ap.antlr.base.AutomataParser;
import com.ap.automata.SymbolTable.value.VariableType;

import java.util.List;

public class ReturnFunction extends Function {
    private final AutomataParser.ExpressionContext returnStatement;

    public ReturnFunction(
            String name,
            String[] parameterNames,
            VariableType[] parameterTypes,
            AutomataParser.Statement_blockContext functionBody,
            AutomataParser.ExpressionContext returnStatement) {
        super(name, parameterNames, parameterTypes, functionBody);
        this.returnStatement = returnStatement;
    }

    @Override
    public AutomataParser.ExpressionContext getReturnStatement() {
        return returnStatement;
    }
}
