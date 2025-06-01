// Define the interface
interface Playable {
    void play(); // Abstract method to be implemented
}

// Implement the interface in Guitar class
class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming the guitar...");
    }
}

// Implement the interface in Piano class
class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano...");
    }
}

// Main class to test interface implementation
public class Main {
    public static void main(String[] args) {
        // Create objects of Guitar and Piano
        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();

        // Call the play() method
        myGuitar.play(); // Output: Strumming the guitar...
        myPiano.play();  // Output: Playing the piano...
    }
}
