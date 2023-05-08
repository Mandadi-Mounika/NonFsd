package Day5;

	public class RaceCondition {
	    private int count = 0;
	    
	    public void incrementCount() {
	        count++;
	    }
	    
	    public int getCount() {
	        return count;
	    }
	    
	    public static void main(String[] args) {
	        RaceCondition demo = new RaceCondition();
	        
	        // Create two threads that increment the count
	        Thread thread1 = new Thread(() -> {
	            for (int i = 0; i < 10000; i++) {
	                demo.incrementCount();
	            }
	        });
	        
	        Thread thread2 = new Thread(() -> {
	            for (int i = 0; i < 10000; i++) {
	                demo.incrementCount();
	            }
	        });
	        
	        // Start both threads
	        thread1.start();
	        thread2.start();
	        
	        // Wait for both threads to finish
	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        // Print the final count value
	        System.out.println("Count: " + demo.getCount());
	    }


}
