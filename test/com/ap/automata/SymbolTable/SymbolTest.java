package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.Symbol;
import com.ap.automata.SymbolTable.VariableType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SymbolTest {

    @Test
    public void symbolStringConstructor() {
        String name = "variable";
        String type = "number";
        VariableType variableType = VariableType.NUMBER;
        String value = "10";

        Symbol symbol = new Symbol(name, type, value);

        assertEquals(symbol.getName(), name);
        assertEquals(symbol.getType(), variableType);
        assertEquals(symbol.getValue(), value);
    }

    @Test
    public void symbolStringConstructorInvalidType() {
        String name = "variable";
        String type = "number2";
        String value = "10";

            Exception exception = assertThrows(IllegalArgumentException.class, () -> new Symbol(name, type, value));
        String expectedMessage = "Type was not a valid enum variable";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void SymbolSVariableTypeConstructor() {
        String name = "variable";
        VariableType variableType = VariableType.NUMBER;
        String value = "10";

        Symbol symbol = new Symbol(name, variableType, value);

        assertEquals(symbol.getName(), name);
        assertEquals(symbol.getType(), variableType);
        assertEquals(symbol.getValue(), value);
    }

    @Test
    public void setSymbol() {
        String name = "variable";
        VariableType variableType = VariableType.NUMBER;
        String value = "10";

        Symbol symbol = new Symbol(name, variableType, value);
        symbol.setValue("20");
        assertEquals(symbol.getValue(), "20");
    }
}