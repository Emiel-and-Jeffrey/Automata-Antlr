package com.ap.automata;

import com.ap.automata.SymbolTable.VariableType;

public class NumberValue extends Value {

    private final Double value;

    public NumberValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    protected boolean isOfCorrectType(Class<? extends Value> type) {
        return type.equals(NumberValue.class);
    }
}
