import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // Define the record Person
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        // Create instances of Person
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Charlie", 30);

        // Print the records (toString() is auto-generated)
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Use records in a List
        List<Person> people = List.of(p1, p2, p3);

        // Filter people with age >= 18 using Streams
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nAdults (age 18+):");
        adults.forEach(System.out::println);
    }
}
