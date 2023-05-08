package Exception;

public class HandlingDivideByZero {

	    public static void main(String[] args) {
	        int numerator = 10;
	        int denominator = 0;
	        try {
	            int result = numerator / denominator;
	            System.out.println("The result is: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!");
	        }
	    }
	


}
