import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two integers
        System.out.print("Enter the first integer (numerator): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer (denominator): ");
        int num2 = scanner.nextInt();

        try {
            // Attempt division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }
}
