package com.ap.automata.SymbolTable.value;

public class BooleanValue extends Value {
    private Boolean value;

    public BooleanValue(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public boolean isOfCorrectType(Class<? extends Value> type) {
        return type.equals(BooleanValue.class);
    }

    @Override
    public VariableType getType() {
        return VariableType.BOOL;
    }
}
