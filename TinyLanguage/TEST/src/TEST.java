import java.util.ArrayList;

public class TEST {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            printUsage();
        }

        TestConfig config = new TestConfig(args);

        ArrayList<String> errors = new ArrayList<>();

        RoutinesTabSymbol routinesTabSymbol = new RoutinesTabSymbol(errors);

        RoutinesQuad routinesQuad = new RoutinesQuad();

        ArrayList<TESTBaseListener> routines = new ArrayList<>();

        routines.add(routinesQuad);
        routines.add(routinesTabSymbol);

        ErrorListener errorListener = new ErrorListener(errors);

        ConstumTestRig.process(config, routines, errorListener);


        if (errors.isEmpty()) {
            System.out.println("No errors on our program");
            routinesQuad.getQuads().display();
            routinesQuad.getQuads().saveAssembly("assembleur");
            routinesTabSymbol.getTable().display();
        } else {
            System.err.println("our program compiled with some errors");
            for (String error : errors)
                System.err.println(error);
        }
    }

    private static void printUsage() {
        System.err.println("TESTLanguage\n  [-tokens] [-tree] [-gui] [-ps file.ps] [-encoding encodingname]\n  [-trace] [-diagnostics] [-SLL]\n  [input-filename(s)]");
        System.err.println("Use startRuleName='tokens' if GrammarName is a lexer grammar.");
        System.err.println("Omitting input-filename makes rig read from stdin.");
        System.exit(0);
    }
}
