package exercise;

import java.io.File;
import java.util.Scanner;

public class CountScores {

	public static void main(String[] args) throws Exception {
		File file = new File("scores2.txt");
		
		if(!file.exists()){
			System.out.println(file + " does not exist.");
			System.exit(0);
		}
		
		int count = 0;
		double total = 0;
		
		try(Scanner input = new Scanner(file)){
			while(input.hasNext()){
				total += input.nextInt();
				count++;
			}
		}
		
		System.out.println("The total is " + total);
		System.out.println("There are " + count + " scores");
		System.out.println("The average is " + (total / count));

	}

}
