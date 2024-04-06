public class IncrementThread extends Thread {

    private Counter counter;
    private int incrementsPerThread;

    // Constructor to initialize IncrementThread with a Counter instance and the number of increments per thread
    public IncrementThread(Counter counter, int incrementsPerThread) {
        this.counter = counter;
        this.incrementsPerThread = incrementsPerThread;
    }

    // Run method to execute the thread
    public void run() {
        // Loop to perform the specified number of increments
        for (int i = 0; i < incrementsPerThread; i++) {
            try {
                // Call the increment method of the Counter instance
                counter.increment();
            } catch (InterruptedException e) {
                // If an InterruptedException occurs, wrap it in a RuntimeException and throw
                throw new RuntimeException(e);
            }
        }
    }
}
