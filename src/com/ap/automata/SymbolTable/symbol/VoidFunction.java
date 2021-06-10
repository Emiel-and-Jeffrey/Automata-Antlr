package com.ap.automata.SymbolTable.symbol;

import com.ap.antlr.base.AutomataParser;
import com.ap.automata.SymbolTable.SymbolTable;
import com.ap.automata.SymbolTable.exceptions.TypeMismatchException;
import com.ap.automata.SymbolTable.value.Value;
import com.ap.automata.SymbolTable.value.VariableType;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * Class that represents a symbol inside of the Symbol Table
 */
public class VoidFunction implements ISymbol {
    private final String name;

    private final String[] parameterNames;
    private final VariableType[] parameterTypes;

    private final List<AutomataParser.StatementContext> functionBody;

    public VoidFunction(String name, String[] parameterNames, VariableType[] parameterTypes, List<AutomataParser.StatementContext> functionBody) {
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

    public List<AutomataParser.StatementContext> GetFunctionBody() {
        return functionBody;
    }

    @Override
    public String getName() {
        return name;
    }

//    /**
//     * Checks whether the specified parameters are valid for this Function
//     *
//     * @param parameters THe paramaters you want to check
//     * @return True if the parameters are of the same type
//     */
//    private boolean AreValidParameters(Value[] parameters) {
//
//        if (this.parameters.length != parameters.length)
//            return false;
//
//        for (int i = 0; i < this.parameters.length; i++) {
//            if (!this.parameters[i].isOfCorrectType(parameters[i].getClass())) {
//                return false;
//            }
//        }
//        return true;
//    }
}
