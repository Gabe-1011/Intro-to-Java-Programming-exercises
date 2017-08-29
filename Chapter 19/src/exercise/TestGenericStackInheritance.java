package exercise;

import java.util.Scanner;

public class TestGenericStackInheritance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create a Stack
		GenericStackInheritance<String> stack = new GenericStackInheritance<>();

		// Prompt the user to enter five strings
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++)
			stack.push(input.next());

		// Display the strings in reverse order
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();

	}

}
