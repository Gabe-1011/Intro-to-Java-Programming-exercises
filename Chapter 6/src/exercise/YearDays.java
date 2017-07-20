package exercise;

import java.util.Scanner;

public class YearDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year from 2000 to 2012");
		int year = input.nextInt();
		
		System.out.println("There are " + numberOfDaysInAYear(year) + " days from 2000 to 2012 ");
		

	}
	
	public static int numberOfDaysInAYear(int year){
		int total = 0;
		
		for(int i = year; i < 2020; i++){
			if(isLeapYear(year)){
				total += 366;
			}
			else
				total += 365;
			
		}
		return total;
		
	}
	
	public static boolean isLeapYear(int year){
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
