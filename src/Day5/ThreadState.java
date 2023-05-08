package Day5;

	public class ThreadState {

	    public static void main(String[] args) throws InterruptedException {
	        
	        // Create a new thread object
	        Thread thread = new Thread(new Runnable() {
	            public void run() {
	                // The thread will sleep for 5 seconds and then terminate
	                try {
	                    Thread.sleep(5000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	        
	        // Start the thread, which will put it into the Runnable state
	        thread.start();
	        
	        // Wait for a short period of time to allow the thread to run
	        Thread.sleep(1000);
	        
	        // Suspend the thread, which will put it into the Blocked/Waiting state
	        thread.suspend();
	        System.out.println("Thread state after calling suspend(): " + thread.getState());
	        
	        // Resume the thread, which will put it back into the Runnable state
	        thread.resume();
	        System.out.println("Thread state after calling resume(): " + thread.getState());
	        
	        // Put the thread into the Timed Waiting state by sleeping for 10 seconds
	        Thread.sleep(10000);
	        System.out.println("Thread state after sleeping for 10 seconds: " + thread.getState());
	        
	        // Wait for the thread to terminate, which will put it into the Terminated state
	        thread.join();
	        System.out.println("Thread state after calling join(): " + thread.getState());
	    }


}
