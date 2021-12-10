/*
* This is a program that calculates the max run of a string with
* reoccuring characters.
*
* @author  Jenoe Balote
* @version 1.0
* @since   2020-12-09
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* This is the MaxRun program.
*/
final class MaxRun {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MaxRun() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The max run function.
    *
    * @param usrInput is the string inputted by the user.
    * @return the max run of the string
    */
    public static int maxRun(final String usrInput) {

        int maxRun = 0;
        int count = 0;
        char previous = ' ';

        // Turns inputted string into an array of characters,
        // then calculates the max run of the character with the most
        // reoccurances.
        for (char character : usrInput.toCharArray()) {

            if (character == previous) {
                count++;
            } else {
                count = 1;
                previous = character;
            }

            if (count > maxRun) {
                maxRun = count;
            }

        }

        return maxRun;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used.
    */
    public static void main(final String[] args) {

        final String usrInput;
        final int maxRun;

        System.out.println("This program calculates the max run of a string.");

        try {
            // Input
            System.out.print("\nEnter a string: ");

            usrInput = new BufferedReader(
                new InputStreamReader(System.in)
            ).readLine();

            // Calls function to get max run of string
            maxRun = maxRun(usrInput);

            // Output
            System.out.println("The Max Run of " + usrInput + " is: " + maxRun);
        } catch (IOException exception) {
            // Invalid input
            System.out.println("Inalid input.");
        } finally {
            System.out.println("\nDone.");
        }
    }
}

