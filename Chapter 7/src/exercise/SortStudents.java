package exercise;

import java.util.Scanner;

public class SortStudents {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int numOfStudents = input.nextInt();
		
		int[] scores = new int[numOfStudents];
		String[] names = new String[numOfStudents];
		
		fillArray(scores, names, input);
		sortDecreasing(scores, names);
		
		for(String e: names){
			System.out.println(e);
		}

	}
	
	public static void fillArray(int[] scores, String[] names, Scanner input){
		for(int i = 0; i < scores.length; i++){
			System.out.println("Enter name of student: ");
			names[i] = input.next();
			System.out.println("Enter score: ");
			scores[i] = input.nextInt();
		}
	}
	
	public static void sortDecreasing(int[] list, String[] names){
		for(int i = 0; i < list.length; i++){
			int currentMax = list[i];
			int currentMaxIndex = i;
			String temp;
			
			for(int j = i + 1; j < list.length; j++){
				if(currentMax < list[j]){
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			if(currentMaxIndex != i){
				temp = names[i];
				names[i] = names[currentMaxIndex];
				names[currentMaxIndex] = temp;
				
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}
