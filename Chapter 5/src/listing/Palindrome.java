package listing;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = input.nextLine();
		
		// index of first character
		int low = 0;
		
		// index of last character
		int high = s.length() - 1;
		
		boolean isPalindrome = true;
		while(low < high){
			if(s.charAt(low) != s.charAt(high)){
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		
		if(isPalindrome == true){
			System.out.println(s + " is a palindrome");
		}
		else{
			System.out.println(s + " is not a palindrome");
		}

	}

}
