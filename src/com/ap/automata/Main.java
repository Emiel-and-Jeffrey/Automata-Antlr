package com.ap.automata;

import com.ap.antlr.base.AutomataLexer;
import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.Z3Lexer;
import com.ap.antlr.base.Z3Parser;
import com.ap.automata.SymbolTable.SymbolTable;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String input;
            int choice;

            System.out.println("Select file type:");
            System.out.println("1) custom language");
            System.out.println("2) sudoku A-type");
            System.out.println("3) sudoku B-type");
            System.out.println("4) exit");
            input = sc.nextLine();

            try {
                choice = Integer.parseInt(input);
                if (choice < 1 || choice > 4) {
                    System.out.println("invalid file type specified");
                    continue;
                }

                if (choice == 4) {
                    System.out.println("bye!");
                    System.exit(0);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("invalid file type specified");
                continue;
            }

            System.out.println("Please enter your filepath:");
            input = sc.nextLine();

            File file = new File(input);

            if (!IsFileValid(file)) {
                System.out.printf("File was not valid");
                return;
            }
            CharStream targetStream = CharStreams.fromFileName(input);

            switch (choice) {
                case 1 -> HandleParsing(targetStream);
                case 2 -> HandleParsingZ3A(targetStream);
                case 3 -> HandleParsingZ3B(targetStream);
            }
        }
    }

    private static void HandleParsing(CharStream stream) {

        AutomataLexer lexer = new AutomataLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AutomataParser parser = new AutomataParser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTable table = new SymbolTable();

        AutomataParserVisitor visitor = new AutomataParserVisitor(new SymbolTable());
        visitor.visit(tree);
    }

    private static void HandleParsingZ3A(CharStream stream) {
        Z3Lexer lexer = new Z3Lexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Z3Parser parser = new Z3Parser(tokens);

        ParseTree tree = parser.result();

        Z3AParserListener listener = new Z3AParserListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, tree);

        System.out.println(listener.printSudokuGrid());
    }

    private static void HandleParsingZ3B(CharStream stream) {
        Z3Lexer lexer = new Z3Lexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Z3Parser parser = new Z3Parser(tokens);

        ParseTree tree = parser.result();

        Z3BParserListener listener = new Z3BParserListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, tree);

        System.out.println(listener.printSudokuGrid());
    }

    private static boolean IsFileValid(File file) {
        return file.exists() && !file.isDirectory();
    }
}
