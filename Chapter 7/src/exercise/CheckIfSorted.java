package exercise;

import java.util.Scanner;

public class CheckIfSorted {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list: ");

		int[] list = new int[input.nextInt()];

		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		
		if(sortArray(list) == true){
			System.out.println("The list is already sorted");
		}
		else
			System.out.println("The list is not sorted");

	}

	public static boolean sortArray(int[] list) {
		boolean sorted = true;

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					sorted = false;
				}
			}
		}
		
		return sorted;
	}

}
