// Base class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass that extends Animal
class Dog extends Animal {
    // Override the makeSound method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Main class to test inheritance
public class Main {
    public static void main(String[] args) {
        // Instantiate Animal and call method
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Output: Some generic animal sound

        // Instantiate Dog and call method
        Dog dog = new Dog();
        dog.makeSound();  // Output: Bark
    }
}
