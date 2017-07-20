package exercise418;

import java.util.Scanner;

public class MajorAndYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two characters");
		
		String majorAndYear = in.nextLine();
		
		char major = majorAndYear.charAt(0);
		
		String year = majorAndYear.substring(1);
		
		getMajor(major);
		getYear(year);
		

	}
	
	public static void getMajor(char major){
		switch(major){
		case 'M': System.out.println("Mathematics");
		          break;
		case 'C': System.out.println("Computer Science");
		          break;
		case 'I': System.out.println("Information Technology");
		          break;
		default:  System.out.println("Invalid major");
		}
	}
	
	public static void getYear(String year){
		switch(year){
		case "1": System.out.println("Freshman");
		          break;
		case "2": System.out.println("Sophomore");
		          break;
		case "3": System.out.println("Junior");
		          break;
		case "4": System.out.println("Senior");
		          break;
		default:  System.out.println("Invalid year");
		}
	}

}
