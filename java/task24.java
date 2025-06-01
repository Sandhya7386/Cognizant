import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names (type 'done' to finish):");

        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            // Stop input if user types "done"
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            // Add name to the list
            studentNames.add(name);
        }

        // Display all names entered
        System.out.println("\nStudent Names:");
        for (String student : studentNames) {
            System.out.println("- " + student);
        }

        scanner.close();
    }
}
