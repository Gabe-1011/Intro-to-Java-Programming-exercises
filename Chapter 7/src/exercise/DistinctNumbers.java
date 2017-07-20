package exercise;

import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers: ");
		
		int[] list = new int[10];
		boolean[] distinct = new boolean[10];
		
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		
		System.out.println("The number of distinct numbers is " + checkDistinctNumbers(list, distinct, input));
		System.out.print("The distinct numbers are: ");
		displayDistinct(distinct, list);


	}
	
	public static int checkDistinctNumbers(int[] list, boolean[] distinct, Scanner input){
		int numOfDistinct = 0;
		for(int i = 0; i < list.length; i++){
			if(isThere(list, i) == false){
				distinct[i] = true;
				numOfDistinct++;
			}
		}
		
		return numOfDistinct;
		
		
	}
	
	public static boolean isThere(int[] list, int i){
		for(int j = 0; j < i; j++){
			if(list[i] == list[j]){
				return true;
			}
		}
		
		return false;
	}
	
	public static void displayDistinct(boolean[] distinct, int[] list){
		for(int i = 0; i < distinct.length; i++){
			if(distinct[i])
				System.out.println(list[i] + " ");
		}
	}

}
