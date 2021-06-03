package com.ap.automata.SymbolTable.symbol;

import com.ap.automata.SymbolTable.value.Value;

/**
 * Class that represents a symbol inside of the Symbol Table
 */
public class Symbol implements ISymbol {
    private String name;
    private Value value;

    /**
     * Initialize a symbol with the variable type as an enum
     *
     * @param name  The name this symbol has
     * @param value The current value this symbol has
     */
    public Symbol(String name, Value value) {
        this.name = name;
        this.value = value;
    }

    /**
     * A method that gets the symbol's name
     *
     * @return the symbols name
     */
    public String getName() {
        return name;
    }

    /**
     * A method that gets the symbol's value
     *
     * @return the symbols value
     */
    public Value getValue() {
        return value;
    }

    /**
     * A method that sets the symbol's value
     */
    public void setValue(Value value) {
        this.value = value;
    }
}
