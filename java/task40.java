public class VirtualThreadsDemo {

    private static final int THREAD_COUNT = 100_000;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting virtual threads test...");
        long virtualTime = runVirtualThreads();

        System.out.println("\nStarting traditional threads test...");
        long traditionalTime = runTraditionalThreads();

        System.out.println("\nResults:");
        System.out.println("Virtual Threads time: " + virtualTime + " ms");
        System.out.println("Traditional Threads time: " + traditionalTime + " ms");
    }

    private static long runVirtualThreads() throws InterruptedException {
        Thread[] threads = new Thread[THREAD_COUNT];
        long start = System.currentTimeMillis();

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = Thread.startVirtualThread(() -> {
                // Minimal work - print can be too slow, so just a quick operation
                // System.out.println("Hello from virtual thread!");
                int x = 1 + 1; // dummy work
            });
        }

        for (Thread t : threads) {
            t.join();
        }

        return System.currentTimeMillis() - start;
    }

    private static long runTraditionalThreads() throws InterruptedException {
        Thread[] threads = new Thread[THREAD_COUNT];
        long start = System.currentTimeMillis();

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(() -> {
                // Minimal work
                // System.out.println("Hello from traditional thread!");
                int x = 1 + 1;
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        return System.currentTimeMillis() - start;
    }
}
