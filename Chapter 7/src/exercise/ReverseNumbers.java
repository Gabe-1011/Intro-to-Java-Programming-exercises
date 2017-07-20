package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[3];
		
		System.out.println("Enter ten integers: ");
		
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		
		System.out.println("Before reversing...");
		System.out.println(Arrays.toString(list));
		
		System.out.println("After reversing...");
		reverseArray(list);

	}
	
	public static void reverseArray(int[] list){
		int[] reverseList = new int[list.length];
		for(int i = 0, j = list.length - 1; i < list.length; i++, j--){
			reverseList[i] = list[j];
		}
		
		System.out.println(Arrays.toString(reverseList));
	}

}
