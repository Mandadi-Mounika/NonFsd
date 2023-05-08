package P2;

import java.util.Scanner;
class IntegerForloop {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int i=scanner.nextInt();
		for(int a=1;a<=i;a++) {
			System.out.println(" "+a);
		}
	}
}