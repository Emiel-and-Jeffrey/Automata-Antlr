package com.ap.automata;

import com.ap.antlr.base.AutomataLexer;
import com.ap.antlr.base.AutomataParser;
import com.ap.automata.SymbolTable.SymbolTable;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter your filepath:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        File file = new File(input);

        if (!IsFileValid(file)) {
            System.out.printf("File was not valid");
            return;
        }
        CharStream targetStream = CharStreams.fromFileName(input);
        HandleParsing(targetStream);
    }

    private static void HandleParsing(CharStream stream) {
        AutomataLexer lexer = new AutomataLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AutomataParser parser = new AutomataParser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTable table = new SymbolTable();

        AutomataParserListener listener = new AutomataParserListener(table);
        walker.walk(listener, tree);

        String tokenString = tokens.getTokens()
                .stream()
                .map(token -> token.getText() + " ")
                .collect(Collectors.joining());
        String treeString = tree.toStringTree(parser);
        String result = listener.getOutput();

        String[] msg = {"Lexed tokens ", "Generated tree ", "Result "};
        String[] vals = {tokenString, treeString, result};

        System.out.println("------------------------------------------------------");
        for (int i = 0; i < msg.length; i++) {
            System.out.printf("%22s: %10s%n", msg[i], vals[i]);
        }
        System.out.println("------------------------------------------------------");
    }

    private static boolean IsFileValid(File file) {
        return file.exists() && !file.isDirectory();
    }
}
