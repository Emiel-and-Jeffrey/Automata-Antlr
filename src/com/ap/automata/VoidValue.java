package com.ap.automata;

public class VoidValue extends Value {
    @Override
    protected boolean isOfCorrectType(Class<? extends Value> type) {
        return type.equals(VoidValue.class);
    }
    //does nothing!
}
