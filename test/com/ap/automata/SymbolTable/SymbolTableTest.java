package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.exceptions.UnknownVariableException;
import com.ap.automata.SymbolTable.exceptions.VariableAlreadyDefinedException;
import com.ap.automata.SymbolTable.symbol.Variable;
import com.ap.automata.SymbolTable.value.NumberValue;
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
    public void addSymbol() {
        NumberValue value = new NumberValue(0.0);
        Variable variable = new Variable("name", value);
        table.AddSymbol(variable);

        assertEquals(variable, table.GetSymbol(variable.getName()));
    }

    @Test
    public void addSymbolAlreadyExistingVariable() {
        NumberValue value = new NumberValue(0.0);
        Variable variable = new Variable("name", value);
        table.AddSymbol(variable);

        Exception exception = assertThrows(VariableAlreadyDefinedException.class, () -> table.AddSymbol(variable));
        String expectedMessage = variable.getName() + " has already been defined";
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