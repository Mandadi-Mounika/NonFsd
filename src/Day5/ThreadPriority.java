package Day5;

public class ThreadPriority implements Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadPriority());
        Thread t2 = new Thread(new ThreadPriority());
        Thread t3 = new Thread(new ThreadPriority());
        
        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        
        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
    
    public void run() {
        // Print thread name and priority
        System.out.println("Thread name: " + Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
        
        try {
            // Sleep for a random time between 0 and 5 seconds
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
