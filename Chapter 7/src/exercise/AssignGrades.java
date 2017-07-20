package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AssignGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		int[] scores = new int[numberOfStudents];
		
		createArray(scores, input);
		
		int bestScore = getBestScore(scores);
		
		char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};
		
//		System.out.println(Arrays.toString(scores));
		
		assignGrades(scores, letterGrades, bestScore);

	}
	
	public static void createArray(int[] list, Scanner input){
		System.out.println("Enter scores: ");
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
	}
	
	public static int getBestScore(int[] list){
		int best = list[0];
		for(int i = 1; i < list.length; i++){
			if(list[i] > best){
				best = list[i];
			}
		}
		
		return best;
	}
	
	public static void assignGrades(int[] list, char[] scores, int bestScore){
		for(int i = 0; i < list.length; i++){
			if(list[i] >= bestScore - 10)
				System.out.println("Student " + (i + 1) + " score is " + list[i] +
						" and grade is " + scores[0]);
			else if(list[i] >= bestScore - 20)
				System.out.println("Student " + (i + 1) + " score is " + list[i] +
						" and grade is " + scores[1]);
			else if(list[i] >= bestScore - 30)
				System.out.println("Student " + (i + 1) + " score is " + list[i] +
						" and grade is " + scores[2]);
			else if(list[i] >= bestScore - 40)
				System.out.println("Student " + (i + 1) + " score is " + list[i] +
						" and grade is " + scores[3]);
			else
				System.out.println("Student " + (i + 1) + " score is " + list[i] +
						" and grade is " + scores[4]);
		}
	}

}
