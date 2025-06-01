import java.util.Scanner;

// Step 1: Define the custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
public class Main {
    // Method to check age and possibly throw the exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age: You must be at least 18 years old.");
        } else {
            System.out.println("Age is valid. You are allowed access.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Step 2: Check age
            checkAge(age);
        } catch (InvalidAgeException e) {
            // Step 3: Catch and display custom exception message
            System.out.println("Exception caught: " + e.getMessage());
        }

        scanner.close();
    }
}
