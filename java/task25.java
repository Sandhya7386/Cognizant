import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add student ID and name entries (type 'done' to stop):");

        while (true) {
            System.out.print("Enter student ID (integer): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int id = Integer.parseInt(input);

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                studentMap.put(id, name);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a valid integer.");
            }
        }

        // Retrieve and display student name by ID
        System.out.print("\nEnter student ID to look up: ");
        int lookupId = scanner.nextInt();

        if (studentMap.containsKey(lookupId)) {
            System.out.println("Student Name: " + studentMap.get(lookupId));
        } else {
            System.out.println("No student found with ID: " + lookupId);
        }

        scanner.close();
    }
}
