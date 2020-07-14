package com.nlmk.sychikov.tm;

import java.util.Scanner;

import static com.nlmk.sychikov.tm.constant.TerminalConst.*;

public class App {

    /**
     *main (start point)
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        run(args);
        displayWelcome();
        process();
    }

    /**
     * Command line args processor
     *
     * @param args command line arguments
     */
    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        final int result = run(param);
        System.exit(result);
    }

    /**
     * One command processor
     *
     * @param param command
     * @return return value
     */
    private static int run(final String param) {
        if (param == null || param.isEmpty()) return -1;
        switch (param) {
            case VERSION:
               return displayVersion();
            case ABOUT:
                return displayAbout();
            case HELP:
                return displayHelp();
            case EXIT:
                return exit();
            default:
                return displayError();
        }
    }

    /**
     * Infinite loop command processor with console input.
     * The "exit" command stops the loop.
     */
    private static void process() {
        final Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!EXIT.equals(command)) {
            System.out.print("command:> ");
            command = scanner.nextLine();
            run(command);
            System.out.println();
        }
    }

    /**
     * Show welcome string
     */
    private static void displayWelcome() {
        System.out.println("** WELCOME TO TASK MANAGER **");
    }

    /**
     * Show available command
     *
     * @return return value
     */
    private static int displayHelp() {
        System.out.println("version - display the version info");
        System.out.println("help - display the list of terminal commands");
        System.out.println("about - display the developer info");
        System.out.println("exit - close the program");
        return 0;
    }

    /**
     * Show error message
     *
     * @return return value
     */
    private static int displayError() {
        System.out.println("Error! Unknown program argument...");
        return -1;
    }

    /**
     * Show version
     *
     * @return return value
     */
    private static int displayVersion() {
        System.out.println("1.0.0");
        return 0;
    }

    /**
     * show exit string
     *
     * @return value
     */
    private static int exit() {
        System.out.println("Our program exit now...");
        System.out.println("Bye!");
        return 0;
    }

    /**
     * Show info
     *
     * @return return value
     */
    private static int displayAbout() {
        System.out.println("Vladimir Sychikov");
        System.out.println("VladimirSychikov@nospam.ru");
        return 0;
    }

}
