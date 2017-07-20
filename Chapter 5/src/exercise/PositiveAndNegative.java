package exercise;

import java.util.Scanner;

public class PositiveAndNegative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int positives = 0;
		int negatives = 0;
		int count = 0;
		double sum = 0;
		
		System.out.print("Enter any number of integers");
		int number = input.nextInt();
		
		if(number == 0){
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		
		while(number != 0){
			if(number > 0){
				positives++;
			}
			else{
				negatives++;
			}
			sum += number;
			count++;
			number = input.nextInt();
		}
		
		double average = sum / count;
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}

}
