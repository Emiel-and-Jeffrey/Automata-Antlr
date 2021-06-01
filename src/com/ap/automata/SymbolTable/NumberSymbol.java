package com.ap.automata.SymbolTable;

/**
 * Class that represents a symbol inside of the Symbol Table
 */
public class NumberSymbol implements ISymbol {
    private String name;
    private double value;

    /**
     * Initialize a symbol with the variable type as an enum
     *
     * @param name  The name this symbol has
     * @param value The current value this symbol has
     */
    public NumberSymbol(String name, double value) {
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
     * A method that gets the symbol's type
     *
     * @return the symbols type
     */
    public VariableType getType() {
        return VariableType.NUMBER;
    }

    /**
     * A method that gets the symbol's value
     *
     * @return the symbols value
     */
    public double getValue() {
        return value;
    }

    /**
     * A method that sets the symbol's value
     */
    public void setValue(double value) {
        this.value = value;
    }
}
