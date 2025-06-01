// Class implementing Runnable interface
class MessagePrinter implements Runnable {
    private String message;
    private int times;

    public MessagePrinter(String message, int times) {
        this.message = message;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 1; i <= times; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " (" + i + ")");
            try {
                Thread.sleep(500); // Pause for 500ms to better observe interleaving
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Runnable instances
        Runnable task1 = new MessagePrinter("Hello from Thread 1", 5);
        Runnable task2 = new MessagePrinter("Greetings from Thread 2", 5);

        // Create Threads
        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        // Start Threads
        thread1.start();
        thread2.start();
    }
}
