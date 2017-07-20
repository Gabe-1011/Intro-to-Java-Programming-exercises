package exercise;

import java.util.Scanner;

public class PasswordVerification {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your password: \n" + "A password is valid if\n"
				+ "1.) It has eight characters\n" + "2.) It consists of only letters and digits\n"
				+ "3.) It must contain at least two digits");
		
		String password = input.next();
		
		if(passwordValid(password)){
			System.out.println(password + " is a valid password.");
		}
		else
			System.out.println(password + " is invalid");

	}
	
	public static boolean passwordValid(String password){
		if(numCharacters(password) == true && lettersAndDigits(password) == true
				&& twoDigits(password) == true){
			return true;
		}
		else
			return false;
	}
	
	public static boolean numCharacters(String password){
		if(password.length() - 1 >= 8){
			return true;
		}
		else
			return false;
	}
	
	public static boolean lettersAndDigits(String password){
		boolean valid = true;
		for(int i = 0; i < password.length(); i++){
			if(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))){
				valid = true;
			}
			else
				valid = false;
		}
		
		return valid;
	}
	
	public static boolean twoDigits(String password){
		int numOfDigits = 0;
		
		for(int i = 0; i < password.length(); i++){
			if(Character.isDigit(password.charAt(i))){
				numOfDigits++;
			}
		}
		
		if(numOfDigits >= 2){
			return true;
		}
		else
			return false;
	}

}
