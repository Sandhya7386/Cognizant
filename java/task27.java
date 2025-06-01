import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Mike");
        names.add("Anna");
        names.add("John");

        // Sort the list using a lambda expression (alphabetical order)
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // Display the sorted list
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
