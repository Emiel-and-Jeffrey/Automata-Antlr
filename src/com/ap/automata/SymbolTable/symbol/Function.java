package com.ap.automata.SymbolTable.symbol;

import com.ap.automata.SymbolTable.value.Value;

/**
 * Class that represents a symbol inside of the Symbol Table
 */
public class Function implements ISymbol {
    private String name;
    private Value[] parameters;

    /**
     * Initialize a symbol with the variable type as an enum
     *
     * @param name       The name this symbol has
     * @param parameters The parameters for this function
     */
    public Function(String name, Value[] parameters) {
        this.name = name;
        this.parameters = parameters;
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
     * Checks whether the specified parameters are valid for this Function
     *
     * @param parameters THe paramaters you want to check
     * @return True if the parameters are of the same type
     */
    public boolean CheckParameters(Value[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            if (!this.parameters[i].isOfCorrectType(parameters[i].getClass())) {
                return false;
            }
        }
        return true;
    }
}
