package misc;

import java.util.Scanner;

public class MonthNameArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] months = {"January", "February", "March"};
		System.out.println("Enter month number: ");
		
		int monthNumber = input.nextInt();
		System.out.println("The month is " + months[monthNumber - 1]);
		
		
	}

}
