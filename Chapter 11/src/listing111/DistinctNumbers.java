package listing111;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers (input ends with 0): ");
		int value;
		
		do {
			value = input.nextInt(); // Read a value from the input
			
			if (!list.contains(value) && value != 0)
				list.add(value);
		} while(value != 0);
		
		// Display the distinct numbers
		for(int number: list)
			System.out.print(number + " ");

	}

}
