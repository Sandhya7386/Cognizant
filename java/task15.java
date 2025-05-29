import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Use StringBuilder to reverse the string
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString.toString());

        // Close the scanner
        sc.close();
    }
}

