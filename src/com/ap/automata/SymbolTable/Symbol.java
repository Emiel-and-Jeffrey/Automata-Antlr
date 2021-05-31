package com.ap.automata.SymbolTable;

/**
 * Class that represents a symbol inside of the Symbol Table
 */
public class Symbol {
    private String name;
    private VariableType type;
    private String value;

    /**
     * Initialize a symbol with the variable type as an enum
     *
     * @param name  The name this symbol has
     * @param type  The variable type of this symbol
     * @param value The current value this symbol has
     */
    public Symbol(String name, String type, String value) {

        if (!VariableType.isValidEnum(type)) {
            throw new IllegalArgumentException("Type was not a valid enum variable");
        }

        this.name = name;
        this.type = VariableType.valueOf(type.toUpperCase());
        this.value = value;
    }

    /**
     * Initialize a symbol with the variable type as an enum
     *
     * @param name  The name this symbol has
     * @param type  The variable type of this symbol
     * @param value The current value this symbol has
     */
    public Symbol(String name, VariableType type, String value) {
        this.name = name;
        this.type = type;
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
        return type;
    }

    /**
     * A method that gets the symbol's value
     *
     * @return the symbols value
     */
    public String getValue() {
        return value;
    }

    /**
     * A method that sets the symbol's value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
