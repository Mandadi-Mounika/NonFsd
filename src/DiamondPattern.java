

	import java.util.Scanner;

	public class DiamondPattern {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();
	        int spaces = rows - 1;
	        int stars = 1;
	        
	        // print the upper half of the diamond
	        for (int i = 1; i <= rows; i++) {
	            // print spaces
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	            // print stars
	            for (int k = 1; k <= stars; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            spaces--;
	            stars += 2;
	        }
	        
	        // print the lower half of the diamond
	        spaces = 1;
	        stars = rows * 2 - 3;
	        for (int i = 1; i <= rows - 1; i++) {
	            // print spaces
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	            // print stars
	            for (int k = 1; k <= stars; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            spaces++;
	            stars -= 2;
	        }
	    }

}
