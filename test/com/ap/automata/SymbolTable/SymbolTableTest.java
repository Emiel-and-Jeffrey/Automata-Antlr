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
        Symbol symbol = new Symbol("name", VariableType.NUMBER, "10");
        table.AddSymbol(symbol);

        assertEquals(symbol, table.GetSymbol(symbol.getName()));
    }

    @Test
    public void addSymbolAlreadyExistingVariable() throws Exception {
        Symbol symbol = new Symbol("name", VariableType.NUMBER, "10");
        table.AddSymbol(symbol);

        Exception exception = assertThrows(VariableAlreadyDefinedException.class, () -> table.AddSymbol(symbol));
        String expectedMessage = symbol.getName() + "was already defined";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getSymbolUnknown() {
        String name = "fakeName";

        Exception exception = assertThrows(UnknownVariableException.class, () -> table.GetSymbol(name));
        String expectedMessage = name + "has not been added to the symbol table";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}