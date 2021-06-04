package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.symbol.Symbol;
import com.ap.automata.SymbolTable.value.NumberValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SymbolTest {

    @Test
    public void numberSymbolConstructor() {
        String name = "variable";
        NumberValue value = new NumberValue(0.0);

        Symbol symbol = new Symbol(name, value);

        assertEquals(symbol.getName(), name);
        assertEquals(symbol.getValue(), value);
    }

    @Test
    public void setValue() {
        String name = "variable";
        NumberValue value = new NumberValue(0.0);
        NumberValue value2 = new NumberValue(20.0);

        Symbol symbol = new Symbol(name, value);
        symbol.setValue(value2);
        assertEquals(value2, symbol.getValue());
    }
}