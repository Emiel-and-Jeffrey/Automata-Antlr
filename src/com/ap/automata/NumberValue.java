package com.ap.automata;

public class NumberValue extends Value {
    private final Double value;

    public NumberValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
