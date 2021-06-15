package com.ap.automata.SymbolTable.symbol;

import com.ap.antlr.base.AutomataParser;
import com.ap.automata.SymbolTable.SymbolTable;
import com.ap.automata.SymbolTable.exceptions.TypeMismatchException;
import com.ap.automata.SymbolTable.value.Value;
import com.ap.automata.SymbolTable.value.VariableType;
import com.ap.automata.SymbolTable.value.VoidValue;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * Class that represents a symbol inside of the Symbol Table
 */
public class Function implements ISymbol {
    private final String name;

    private final String[] parameterNames;
    private final VariableType[] parameterTypes;

    private final AutomataParser.Statement_blockContext functionBody;

    public Function(String name, String[] parameterNames, VariableType[] parameterTypes, AutomataParser.Statement_blockContext functionBody) {
        this.name = name;
        this.parameterNames = parameterNames;
        this.parameterTypes = parameterTypes;
        this.functionBody = functionBody;
    }

    public String[] getParameterNames() {
        return parameterNames;
    }

    public VariableType[] getParameterTypes() {
        return parameterTypes;
    }

    public AutomataParser.Statement_blockContext getFunctionBody() {
        return functionBody;
    }

    public AutomataParser.ExpressionContext getReturnStatement() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
