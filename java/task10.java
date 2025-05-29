import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generates a number from 1 to 100
        int userGuess = 0; // Variable to store the user's guess
        int attempts = 0;  // Counter for the number of attempts

        // Game loop: continue until the user guesses correctly
        while (userGuess != numberToGuess) {
            // Prompt the user to enter a guess
            System.out.print("Guess the number (between 1 and 100): ");
            userGuess = sc.nextInt();
            attempts++; // Increment the attempt counter

            // Provide feedback based on the guess
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        // Close the scanner
        sc.close();
    }
}

