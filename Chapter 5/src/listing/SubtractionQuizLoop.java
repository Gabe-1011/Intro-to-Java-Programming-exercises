package listing;

import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 5; // number of questions
		int correctCount = 0;	// count the number of correct answers
		int count = 0;	// count the number of questions
		long startTime = System.currentTimeMillis();
		String output = " "; // output string is inititally empty
		Scanner input = new Scanner(System.in);
		
		while(count < NUMBER_OF_QUESTIONS){
			// 1. Generate two random single-digit integers
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			
			// 2. If number1 < number2, swap
			if(number1 < number2){
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			// 3. Prompt the student to answer
			System.out.print("What is " + number1 +
					" - " + number2 + "? ");
			int answer = input.nextInt();
			
			// 4. Grade the answer
			if(number1 - number2 == answer){
				System.out.println("You are correct!");
				correctCount++;
			}
			else{
				System.out.println("Your answer is wrong.\n" + number1
						+ " - " + number2 + " should be " + (number1 - number2));
			}
			
			count++;
			
			output += "\n" + number1 + "-" + number2 + "=" + answer +
					((number1 - number2 == answer) ? " correct" : " wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount +
				"\nTest time is " + testTime / 1000 + " seconds\n" + output);

	}

}
