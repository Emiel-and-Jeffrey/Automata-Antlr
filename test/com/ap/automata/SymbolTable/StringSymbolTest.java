package com.ap.automata.SymbolTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringSymbolTest {

    @Test
    public void stringSymbolConstructor() {
        String name = "variable";
        String value = "10";

        StringSymbol symbol = new StringSymbol(name, value);

        assertEquals(symbol.getName(), name);
        assertEquals(symbol.getType(), VariableType.STRING);
        assertEquals(symbol.getValue(), value);
    }

    @Test
    public void getType() {
        String name = "variable";
        String value = "10";

        StringSymbol symbol = new StringSymbol(name, value);
        assertEquals(symbol.getType(), VariableType.STRING);
    }

    @Test
    public void setValue() {
        String name = "variable";
        String value = "10";

        StringSymbol symbol = new StringSymbol(name, value);
        symbol.setValue("20");
        assertEquals(symbol.getValue(), "20");
    }
}