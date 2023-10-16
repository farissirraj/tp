package fittrack;

import fittrack.command.CommandResult;

import java.util.Scanner;

/**
 * Represents the user interface of FitTrack.
 */
public class Ui {
    private final Scanner in;
    private final String LINE = "____________________________________________________________";

    /**
     * Constructs UI of FitTrack.
     */
    public Ui() {
        in = new Scanner(System.in);
    }

    /**
     * Scans a line from the user input.
     *
     * @return user input as a line of string
     */
    public String scanNextLine() {
        return in.nextLine();
    }

    /**
     * Scans a command line from the user input.
     *
     * @return command line as a line of string
     */
    public String scanCommandLine() {
        return scanNextLine();
    }

    public void closeScanner() {
        in.close();
    }

    public void printBlankLine() {
        System.out.println();
    }

    public void printLine() {
        System.out.println(LINE);
    }

    public void printWelcome() {
        System.out.println("Welcome to FitTrack!");
    }

    public void printCommandResult(CommandResult commandResult) {
        System.out.println(commandResult.getFeedback());
        printBlankLine();
    }

    /**
     * Prints greetings to user and the height and weight that
     * the user has entered.
     *
     * @param name name of the user
     * @param profile array containing the height and weight
     */
    public void printProfileDetails(String name, double[] profile) {
        printLine();
        System.out.println("Hi " + name + "! Nice to meet you!");
        System.out.println("Height: " + profile[0]);
        System.out.println("Weight: " + profile[1]);
        printLine();
    }
}