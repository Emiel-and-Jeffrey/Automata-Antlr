package com.ap.automata.SymbolTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class NumberSymbolTest {

    @Test
    public void numberSymbolConstructor() {
        String name = "variable";
        double value = 0;

        NumberSymbol symbol = new NumberSymbol(name, value);

        assertEquals(symbol.getName(), name);
        assertEquals(symbol.getValue(), value);
    }

    @Test
    public void getType() {
        String name = "variable";
        double value = 0;

        NumberSymbol symbol = new NumberSymbol(name, value);
        assertEquals(symbol.getType(), VariableType.NUMBER);
    }

    @Test
    public void setValue() {
        String name = "variable";
        double value = 0;

        NumberSymbol symbol = new NumberSymbol(name, value);
        symbol.setValue(20);
        assertEquals(20, symbol.getValue());
    }
}