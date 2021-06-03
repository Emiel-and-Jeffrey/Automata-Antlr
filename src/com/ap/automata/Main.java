package com.ap.automata;

import com.ap.antlr.base.AutomataLexer;
import com.ap.antlr.base.AutomataParser;
import com.ap.automata.SymbolTable.SymbolTable;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //try out the following: ( ( 4^2.2 - 3 ) * 3.2! ) / 5 + 2
        System.out.println("Please enter your equation:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        AutomataLexer lexer = new AutomataLexer(CharStreams.fromString(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AutomataParser parser = new AutomataParser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTable table = new SymbolTable();

        AutomataParserVisitor visitor = new AutomataParserVisitor();
        visitor.visit(tree);

        AutomataParserListener listener = new AutomataParserListener(table);
        walker.walk(listener, tree);

        String tokenString = tokens.getTokens()
                .stream()
                .map(token -> token.getText() + " ")
                .collect(Collectors.joining());
        String treeString = tree.toStringTree(parser);
        String result = listener.getOutput();

        String[] msg = {"Input string ", "Lexed tokens ", "Generated tree ", "Result "};
        String[] vals = {input, tokenString, treeString, result};

        System.out.println("------------------------------------------------------");
        for (int i = 0; i < msg.length; i++) {
            System.out.printf("%22s: %10s%n", msg[i], vals[i]);
        }
        System.out.println("------------------------------------------------------");

        List<Double> list = new ArrayList<>();
        test(list);
    }

    public static void test(List<? extends Number> test)
    {

    }
}
