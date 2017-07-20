package misc;

import java.util.Scanner;

public class InitializingArray1 {

	public static void main(String[] args) {
		double[] myList = new double[2];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter " + myList.length + " values: ");
		
		for(int i = 0; i < myList.length; i++){
			myList[i] = input.nextDouble();
		}
		
		for(int i = 0; i < myList.length; i++){
			System.out.println(myList[i] + "");
		}

	}

}
