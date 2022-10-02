/*
*
* This program is a classic microwave.
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2020-10-01
*
* This is a microwave program.
*/

import java.util.Scanner;
import java.io.Console;

/**
 * This is a microwave program.
 */

final class Microwave {

    /**
     * This is the multiplier for two items.
     */
    public static final double TWO_ITEMS = 1.5;
    /**
     * This is the multiplier for three items.
     */
    public static final double THREE_ITEMS = 2;
    /**
     * This is the variable for a sub.
     */
    public static final String SUB = "sub";
    /**
     * This is the variable for pizza.
     */
    public static final String PIZZA = "pizza";
    /**
     * This is the variable for soup.
     */
    public static final String SOUP = "soup";
     /**
     * This is the variable for one.
     */
    public static final double ONE = 1;
    /**
     * This is the variable for two.
     */
    public static final double TWO = 2;
    /**
     * This is the variable for three.
     */
    public static final double THREE = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        // Identifying the changing variables.
        double cookTime = 0;
        double finalTime = 0;
        double minutes = 0;
        double seconds = 0;

        // This is where the program receives inputs.
        final Console console = System.console();
        final String userInput = console.readLine(
            "Are you reheating a sub, pizza or soup : ");
        final String quantityString = console.readLine("How many " + userInput + "s would you like to reheat (max 3) : ");
        final double quantity = Integer.valueOf(quantityString);

        // Catch invalid inputs.
        if (userInput.equals(SUB) || userInput.equals(PIZZA)
            || userInput.equals(SOUP)) {

            // Determines what item is inputted
            if (userInput.equals(SUB)) {
                cookTime = 60;
            } else if (userInput.equals(PIZZA)) {
                cookTime = 45;
            } else if (userInput.equals(SOUP)) {
                cookTime = 105;
            }

            // Calculate time required in microwave
            if (quantity == ONE || quantity == TWO
                || quantity == THREE) {
                if (quantity == ONE) {
                    finalTime = cookTime;
                } else if (quantity == TWO) {
                    finalTime = cookTime * TWO_ITEMS;
                } else if (quantity == THREE) {
                    finalTime = cookTime * THREE_ITEMS;
                }

                // Calculate time in minutes and seconds
                seconds = finalTime / 60;
                minutes = Math.floor(seconds);
                seconds = (seconds - minutes) * 60;
                System.out.println("That will take " + minutes +
                  " minute(s) and " + seconds + " seconds in the microwave.");

            // Catches invalid number inputs
            } else {
                System.out.println("Invalid Number Entered.");
            }
            // Catches invalid inputs
        } else {
            System.out.println("Invalid Input Entered.");
        }
        System.out.println("\nDone.");
    }
}

