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
public class Function implements ISymbol {
    private String name;

    private String[] parameterNames;
    private VariableType parameterTypes;

    private Value[] parameters;



    //private ParseTree functionRoot;
    private List<AutomataParser.StatementContext> statements;

    /**
     * Initialize a symbol with the variable type as an enum
     *
     * @param name       The name this symbol has
     * @param parameters The parameters for this function
     */
    public Function(String name, Value[] parameters, List<AutomataParser.StatementContext> statements) {
        this.name = name;
        this.parameters = parameters;
        this.statements = statements;
    }

    /**
     * A method that gets the symbol's name
     *
     * @return the symbols name
     */
    @Override()
    public String getName() {
        return name;
    }


    /**
     * Call this function
     *
     * @param parameters The parameters for this method
     * @return The statements that need to be visited for this function to run
     */
    public List<AutomataParser.StatementContext> Run(Value[] parameters) {
        if (!AreValidParameters(parameters)) {
            throw new TypeMismatchException("Parameters where not of correct type");
        }
        return statements;
    }

    /**
     * Checks whether the specified parameters are valid for this Function
     *
     * @param parameters THe paramaters you want to check
     * @return True if the parameters are of the same type
     */
    private boolean AreValidParameters(Value[] parameters) {

        if (this.parameters.length != parameters.length)
            return false;

        for (int i = 0; i < this.parameters.length; i++) {
            if (!this.parameters[i].isOfCorrectType(parameters[i].getClass())) {
                return false;
            }
        }
        return true;
    }
}
