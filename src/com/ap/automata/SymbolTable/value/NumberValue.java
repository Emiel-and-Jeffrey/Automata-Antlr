package com.ap.automata.SymbolTable.value;

public class NumberValue extends Value {

    private Double value;

    public NumberValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean isOfCorrectType(Class<? extends Value> type) {
        return type.equals(NumberValue.class);
    }

    @Override
    public VariableType getType() {
        return VariableType.NUMBER;
    }
}
