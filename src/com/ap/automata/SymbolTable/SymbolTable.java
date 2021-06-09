package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.exceptions.UnknownVariableException;
import com.ap.automata.SymbolTable.exceptions.VariableAlreadyDefinedException;
import com.ap.automata.SymbolTable.symbol.ISymbol;

import java.util.HashMap;

/**
 * The symbol table class is used to keep track of variables
 */
public class SymbolTable implements ISymbol {
    private final HashMap<String, ISymbol> table;

    public SymbolTable() {
        table = new HashMap<>();
    }

    /**
     * Add a symbol to the symbol table
     *
     * @param symbol the symbol you want to add
     */
    public void AddSymbol(ISymbol symbol) throws VariableAlreadyDefinedException {
        if (table.containsKey(symbol.getName())) {
            throw new VariableAlreadyDefinedException(String.format("%s has already been defined", symbol.getName()));
        }
        table.put(symbol.getName(), symbol);
    }

    /**
     * Get a symbol from the symbol table
     *
     * @param name the name you want the symbol for
     */
    public <T extends ISymbol> T GetSymbol(String name, Class<T> type) throws UnknownVariableException {
        if (!table.containsKey(name)) {
            throw new UnknownVariableException(String.format("%s has not been defined", name));
        }
        return type.cast(table.get(name));
    }

    @Override
    public String getName() {
        return "SymbolTable";
    }
}
