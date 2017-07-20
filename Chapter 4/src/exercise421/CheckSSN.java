package exercise421;

import java.util.Scanner;

public class CheckSSN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your social security number");
		
		String SSN = in.nextLine();
		
		String[] parts = SSN.split("-");
		
		isValid(parts, SSN);
		
		in.close();
	}
	
	public static void isValid(String[] parts, String SSN){
		if(parts[0].length() == 3 && parts[1].length() == 2 && parts[2].length() == 4){
			System.out.println(SSN + " is a valid social security number");	
		} 
		else{
			System.out.println(SSN + " is invalid");
		}
	}

}
