import java.util.Scanner;

public class ArraySumAndAverage {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Prompt the user to enter the elements
        System.out.println("Enter the elements:");

        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Calculate the average
        double average = (double) sum / n;

        // Display the sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);

        // Close the scanner
        sc.close();
    }
}

