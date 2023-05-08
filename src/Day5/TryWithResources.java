package Day5;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class TryWithResources {
	    public static void main(String[] args) {
	        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
	            String line = reader.readLine();
	            while (line != null) {
	                System.out.println(line);
	                line = reader.readLine();
	            }
	        } catch (IOException e) {
	            System.err.println("An error occurred while reading the file: " + e.getMessage());
	        }
	    }

}
