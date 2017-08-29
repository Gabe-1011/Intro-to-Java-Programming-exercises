package listing;

import java.util.Scanner;

public class ComputeFactorial {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer: ");
		int n = input.nextInt();
		
		// Display factorial
		System.out.println("Factorial of " + n + " is " + factorial(n));

	}
	
	public static long factorial(int n){
		if(n == 0) // base case. 0! = 1
			return 1;
		else
			return n * factorial(n - 1);
	}

}
