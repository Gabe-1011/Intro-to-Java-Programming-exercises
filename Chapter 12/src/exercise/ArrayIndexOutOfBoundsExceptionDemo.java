package exercise;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100);
		}
		
		try{
			System.out.println("Enter the index of the array: ");
			int index = input.nextInt();
			
			System.out.println(arr[index]);	
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("The index you entered is out of bounds.");
		}
		
		

	}

}
