package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException_2 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;

		boolean continueInput = true;

		do {
			try {
				System.out.println("Enter two integers: ");
				int number1 = input.nextInt();
				int number2 = input.nextInt();
				sum = number1 + number2;
				System.out.println(sum);
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Didnt enter an integer.\n" + "Please try again");
				input.nextLine();
			}
		} while (continueInput);

	}

}
