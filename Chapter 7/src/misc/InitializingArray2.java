package misc;

import java.util.Scanner;

public class InitializingArray2 {

	public static void main(String[] args) {
		double[] myList = new double[2];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < myList.length; i++){
			myList[i] = Math.random() * 2;
		}

	}

}
