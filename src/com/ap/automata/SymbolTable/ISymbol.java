package com.ap.automata.SymbolTable;

public interface ISymbol {

    /**
     * A method that gets the symbol's name
     *
     * @return the symbols name
     */
    String getName();

    /**
     * A method that gets the symbol's type
     *
     * @return the symbols type
     */
    VariableType getType();
}
