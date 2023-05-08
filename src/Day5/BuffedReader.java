package Day5;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class BuffedReader {
	    public static void main(String[] args) {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        try {
	            System.out.print("Enter your name: ");
	            String name = reader.readLine();
	            System.out.println("Hello, " + name + "!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	}


}
