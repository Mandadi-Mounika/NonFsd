package Enums;

	import java.util.Scanner;

	public class Calculator {

	    enum Operation {
	        ADDITION,
	        SUBTRACTION,
	        MULTIPLICATION,
	        DIVISION
	    }
     public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter first number:");
	        double num1 = scanner.nextDouble();

	        System.out.println("Enter second number:");
	        double num2 = scanner.nextDouble();

	        System.out.println("Enter operation (+, -, *, /):");
	        char operationChar = scanner.next().charAt(0);
	        Operation operation = null;

	        switch (operationChar) {
	            case '+':
	                operation = Operation.ADDITION;
	                break;
	            case '-':
	                operation = Operation.SUBTRACTION;
	                break;
	            case '*':
	                operation = Operation.MULTIPLICATION;
	                break;
	            case '/':
	                operation = Operation.DIVISION;
	                break;
	            default:
	                System.out.println("Invalid operation!");
	                System.exit(0);
	        }

	        double result = 0;

	        switch (operation) {
	            case ADDITION:
	                result = num1 + num2;
	                break;
	            case SUBTRACTION:
	                result = num1 - num2;
	                break;
	            case MULTIPLICATION:
	                result = num1 * num2;
	                break;
	            case DIVISION:
	                result = num1 / num2;
	                break;
	            default:
	                System.out.println("Invalid operation!");
	                System.exit(0);
	        }

	        System.out.println("Result: " + result);
	    }
	


}
