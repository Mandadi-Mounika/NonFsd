package Test;

@FunctionalInterface
interface MyFunctionalInterface {
    int add(int a, int b);
}
public class Example {
	
	    public static void main(String[] args) {
	       MyFunctionalInterface sum = (a, b) -> a * b;

	        int result = sum.add(10, 20);
	        System.out.println("Result: " + result); 
	    }
	
}
