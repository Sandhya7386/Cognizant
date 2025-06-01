// Define the Car class
class Car {
    // Attributes
    String make;
    String model;
    int year;

    // Constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make : " + make);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println();
    }
}

// Main class to test Car objects
public class Main {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Call the displayDetails method
        car1.displayDetails();
        car2.displayDetails();
    }
}
