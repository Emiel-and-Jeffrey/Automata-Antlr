package com.ap.automata.SymbolTable.value;

public class VoidValue extends Value {
    @Override
    public boolean isOfCorrectType(Class<? extends Value> type) {
        return type.equals(VoidValue.class);
    }

    @Override
    public VariableType getType() {
        return VariableType.VOID;
    }
    //does nothing!
}
