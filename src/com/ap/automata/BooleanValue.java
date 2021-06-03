package com.ap.automata;

public class BooleanValue extends Value {
    private final Boolean value;

    public BooleanValue(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    @Override
    protected boolean isOfCorrectType(Class<? extends Value> type) {
        return type.equals(BooleanValue.class);
    }
}
