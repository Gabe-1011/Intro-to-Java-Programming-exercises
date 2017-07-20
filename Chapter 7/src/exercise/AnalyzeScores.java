package exercise;

import java.util.Scanner;

public class AnalyzeScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		System.out.println("Enter scores: ");
		
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}
		
		checkList(scores);

	}
	
	public static int getAverage(int[] list){
		int sum = 0;
		for(int i = 0; i < list.length; i++){
			sum += list[i];
		}
		
		int average = sum / (list.length);
		return average;
	}
	
	public static void checkList(int[] list){
		int numOfAbove = 0;
		int numOfBelow = 0;
		int average = getAverage(list);
		
		for(int i = 0; i < list.length; i++){
			if(list[i] >= average){
				numOfAbove++;
			}
			else if(list[i] < average){
				numOfBelow++;
			}
		}
		
		System.out.println("The average of the scores is " + average);
		System.out.println("There are " + numOfAbove + " scores above the average.");
		System.out.println("There are " + numOfBelow + " scores below the average.");
	}

}
