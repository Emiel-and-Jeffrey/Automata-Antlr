package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.exceptions.UnknownVariableException;
import com.ap.automata.SymbolTable.exceptions.VariableAlreadyDefinedException;

import java.util.HashMap;

/**
 * The symbol table class is used to keep track of variables
 */
public class SymbolTable {
    private HashMap<String, Symbol> table;

    public SymbolTable() {
        table = new HashMap<>();
    }

    /**
     * Add a symbol to the symbol table
     *
     * @param symbol the symbol you want to add
     */
    public void AddSymbol(Symbol symbol) throws VariableAlreadyDefinedException {
        if (table.containsKey(symbol.getName())) {
            throw new VariableAlreadyDefinedException(symbol.getName() + "was already defined");
        }
        table.put(symbol.getName(), symbol);
    }

    /**
     * Get a symbol from the symbol table
     *
     * @param name the name you want the symbol for
     */
    public Symbol GetSymbol(String name) throws UnknownVariableException {
        if (!table.containsKey(name)) {
            throw new UnknownVariableException(name + "has not been added to the symbol table");
        }
        return table.get(name);
    }
}
