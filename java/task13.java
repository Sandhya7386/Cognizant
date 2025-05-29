import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0; // Fibonacci(0) = 0
        } else if (n == 1) {
            return 1; // Fibonacci(1) = 1
        } else {
            // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a positive integer n
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        // Call the fibonacci method and display the result
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);

        // Close the scanner
        sc.close();
    }
}
