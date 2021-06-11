package com.ap.automata.SymbolTable.symbol;

import com.ap.antlr.base.AutomataParser;
import com.ap.automata.SymbolTable.value.VariableType;

import java.util.List;

public class ReturnFunction extends Function {
    private final AutomataParser.Return_expressionContext returnStatement;

    public ReturnFunction(
            String name,
            String[] parameterNames,
            VariableType[] parameterTypes,
            List<AutomataParser.StatementContext> functionBody,
            AutomataParser.Return_expressionContext returnStatement) {
        super(name, parameterNames, parameterTypes, functionBody);
        this.returnStatement = returnStatement;
    }

    @Override
    public AutomataParser.Return_expressionContext getReturnStatement() {
        return returnStatement;
    }
}
