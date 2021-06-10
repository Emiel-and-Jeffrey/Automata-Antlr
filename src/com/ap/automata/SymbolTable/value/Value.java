package com.ap.automata.SymbolTable.value;

import com.ap.automata.SymbolTable.exceptions.TypeMismatchException;

public abstract class Value {

    public abstract boolean isOfCorrectType(Class<? extends Value> type);

    public abstract VariableType getType();

    public <T extends Value> T getValueAs(Class<T> type) {
        if (!isOfCorrectType(type))
            throw new TypeMismatchException("Types are not equal");

        return type.cast(this);
    }
}
