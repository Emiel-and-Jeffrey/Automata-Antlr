package com.ap.automata;

import com.ap.automata.SymbolTable.ISymbol;

public abstract class Value {
    public <T extends Value> T getValueAs(Class<T> type) {
        return type.cast(this);
    }
}
