package evenOrNotComparism;

import java.util.Scanner;

public class comparingTwoNumbersForEven {
	
	public static void main (String [] args) {
		
		int number;
		
		
		System.out.println("Enter number");
		
		Scanner scan = new Scanner (System.in);
		number = scan.nextInt();
		
		int result = number % 2;
		
		if (result == 0) {
			System.out.println(number + " is an even number");
		}
		
		else {
			System.out.println(number + " is not an even number");
		}
	}

}
