package com.nlmk.sychikov.tm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        run(args);
        System.out.println("HELLO WORLD");
    }

    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length <1) return;
        final String param = args[0];
        if ("version".equals(param)) displayVersion();
        if ("about".equals(param)) displayAbout();
        if ("help".equals(param))  displayHelp();
        else displayError();
    }

    private static void displayHelp() {
        System.out.println("version - display version info");
        System.out.println("help - display list of terminal commands");
        System.out.println("about - display developer info");
        System.exit(0);
    }

    private static void displayError() {
        System.out.println("Error! Unknown program argument...");
        System.exit(-1);
    }

    private static void displayVersion() {
        System.out.println("1.0.0");
        System.exit(0);
    }

    private static void displayAbout() {
        System.out.println("Vladimir Sychikov");
        System.out.println("VladimirSychikov@nospam.ru");
        System.exit(0);
    }

}
