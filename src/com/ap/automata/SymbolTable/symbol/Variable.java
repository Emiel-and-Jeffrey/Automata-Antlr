package com.ap.automata.SymbolTable.symbol;

import com.ap.automata.SymbolTable.exceptions.TypeMismatchException;
import com.ap.automata.SymbolTable.value.Value;

import java.util.Objects;

/**
 * Class that represents a symbol inside of the Symbol Table
 */
public class Variable implements ISymbol {
    private String name;
    private Value value;

    /**
     * Initialize a symbol with the variable type as an enum
     *
     * @param name  The name this symbol has
     * @param value The current value this symbol has
     */
    public Variable(String name, Value value) {
        this.name = name;
        this.value = value;
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

        Objects.requireNonNull(value, "Value can not be null");

        if (!value.isOfCorrectType(this.value.getClass())) {
            throw new TypeMismatchException(String.format("%s is not type %s but of type %s", name, value.getClass().toString(), this.value.getClass().toString()));
        }
        this.value = value;
    }
}
