public class Counter {

    private int count = 0;

    // Increment the count by 1 and wait for 1000 milliseconds (1 second)
    public synchronized void increment() throws InterruptedException {
        count++;
        System.out.print("" + count + " ");
        Thread.sleep(1000);
    }

    // Get the current count value
    public int getCount() {
        return count;
    }
}
