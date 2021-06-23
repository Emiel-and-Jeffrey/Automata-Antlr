package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.value.VariableType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableTypeTest {
    @Test
    public void variableTypeToString() {
        VariableType variableType = VariableType.NUMBER;

        assertEquals(variableType.toString(), "number");
    }

    @Test
    public void isValidEnumValidValue() {
        assertTrue(VariableType.isValidEnum("number"));
    }

    @Test
    public void isValidEnumValidValueCapitalized() {
        assertTrue(VariableType.isValidEnum("NUMBER"));
    }

    @Test
    public void isValidEnumInvalidValue() {
        assertFalse(VariableType.isValidEnum("number2"));
    }
}