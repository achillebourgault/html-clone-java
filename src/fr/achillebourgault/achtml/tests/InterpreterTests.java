package fr.achillebourgault.achtml.tests;

import fr.achillebourgault.achtml.interpreter.Interpreter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

public class InterpreterTests {

    private List<Callable> testsMethods;

    public InterpreterTests() {
        this.testsMethods = new ArrayList<>();
        deployTests();
    }

    private void deployTests() {
        Callable testManyClasses = new Callable() {
            @Override
            public Object call() {
                String raw = "<div class=\"classA classB \"></div>";
                Interpreter interpreter = new Interpreter(raw);

                if (interpreter.getBody().getClasses().size() != 2)
                    return false;
                return true;
            }
        };

        Callable testNoClasses = new Callable() {
            @Override
            public Object call() {
                String raw = "<div></div>";
                Interpreter interpreter = new Interpreter(raw);

                System.out.println("div no class size = " + interpreter.getBody().getClasses().size());

                if (interpreter.getBody().getClasses().size() != 0)
                    return false;
                return true;
            }
        };

        Callable testManySpacesInClasses = new Callable() {
            @Override
            public Object call() {
                String raw = "<div class=\"    classA      classB   classC  \"></div>";
                Interpreter interpreter = new Interpreter(raw);

                if (interpreter.getBody().getClasses().size() != 3)
                    return false;
                return true;
            }
        };

        testsMethods.add(testManyClasses);
        testsMethods.add(testNoClasses);
        testsMethods.add(testManySpacesInClasses);
    }

    public void startTests() throws Exception {
        int nbTest = 1;
        int successTests = 0;

        System.out.println("[" + LocalDate.now() + "] Start tests.");
        System.out.println("Tests to execute: " + testsMethods.size());

        System.out.println("\n");
        for (Callable test : testsMethods) {
            System.out.println("Deploy test #" + nbTest);
            Object call = test.call();

            System.out.println("\n\nStatus:");
            if (call instanceof Boolean && (boolean) call == true) {
                System.out.println("\u001B[32m" + "SUCCESS" + "\u001B[0m");
                successTests++;
            } else
                System.out.println("\u001B[31m" + "FAILURE" + "\u001B[0m");
            nbTest++;
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("END Tests");
        System.out.println("Efficiency: " + ((successTests / testsMethods.size()) * 100) + "%.");
    }
}
