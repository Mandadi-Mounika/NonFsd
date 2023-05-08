package Day5;

	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	public class ThreadPool {
	    public static void main(String[] args) {
	        // Create a thread pool with a fixed number of threads
	        ExecutorService executor = Executors.newFixedThreadPool(3);

	        // Submit tasks to the thread pool
	        executor.submit(new Task("Task 1"));
	        executor.submit(new Task("Task 2"));
	        executor.submit(new Task("Task 3"));
	        executor.submit(new Task("Task 4"));
	        executor.submit(new Task("Task 5"));

	        // Shutdown the thread pool once all tasks have completed
	        executor.shutdown();
	    }

	    static class Task implements Runnable {
	        private String name;

	        public Task(String name) {
	            this.name = name;
	        }

	        public void run() {
	            System.out.println("Executing task " + name + " on thread " + Thread.currentThread().getName());
	        }
	    }


}
