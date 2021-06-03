package com.ap.automata.SymbolTable.symbol;

import com.ap.automata.SymbolTable.value.Value;

public interface ISymbol {

    /**
     * A method that gets the symbol's name
     *
     * @return the symbols name
     */
    String getName();

    /**
     * A method that gets the symbol's value class
     *
     * @return the symbols value class
     */
    Value getValue();
}
