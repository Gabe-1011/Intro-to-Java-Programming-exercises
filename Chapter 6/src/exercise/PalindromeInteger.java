package exercise;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		System.out.println(number + " in reverse is " + reverse(number));
		
		if(isPalindrome(number)){
			System.out.println(number + " is a palindrome.");
		}
		else
			System.out.println(number + " is not a palindrome.");

	}
	
	public static int reverse(int number){
		String newNum = "";
		while(number != 0){
			newNum += (number % 10);
		    int remaining = number / 10;
			number = remaining;
		}
		return Integer.parseInt(newNum);
	}
	
	public static boolean isPalindrome(int number){
		if(reverse(number) == number){
			return true;
		}
		else
			return false;
	}

}
