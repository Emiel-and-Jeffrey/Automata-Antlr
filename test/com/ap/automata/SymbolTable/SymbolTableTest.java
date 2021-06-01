package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.exceptions.UnknownVariableException;
import com.ap.automata.SymbolTable.exceptions.VariableAlreadyDefinedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SymbolTableTest {

    SymbolTable table;

    @BeforeEach
    public void setUp() {
        table = new SymbolTable();
    }

    @Test
    public void addSymbol() throws Exception {
        NumberSymbol symbol = new NumberSymbol("name", 10);
        table.AddSymbol(symbol);

        assertEquals(symbol, table.GetSymbol(symbol.getName()));
    }

    @Test
    public void addSymbolAlreadyExistingVariable() throws Exception {
        StringSymbol symbol = new StringSymbol("name", "10");
        table.AddSymbol(symbol);

        Exception exception = assertThrows(VariableAlreadyDefinedException.class, () -> table.AddSymbol(symbol));
        String expectedMessage = symbol.getName() + " has already been defined";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getSymbolUnknown() {
        String name = "fakeName";

        Exception exception = assertThrows(UnknownVariableException.class, () -> table.GetSymbol(name));
        String expectedMessage = name + " has not been defined";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}