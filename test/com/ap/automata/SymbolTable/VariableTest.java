package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.symbol.Variable;
import com.ap.automata.SymbolTable.value.NumberValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class VariableTest {

    @Test
    public void VariableConstructor() {
        String name = "variable";
        NumberValue value = new NumberValue(0.0);

        Variable variable = new Variable(name, value);

        assertEquals(variable.getName(), name);
        assertEquals(variable.getValue(), value);
    }

    @Test
    public void setValue() {
        String name = "variable";
        NumberValue value = new NumberValue(0.0);
        NumberValue value2 = new NumberValue(20.0);

        Variable variable = new Variable(name, value);
        variable.setValue(value2);
        assertEquals(value2, variable.getValue());
    }
}