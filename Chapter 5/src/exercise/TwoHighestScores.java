package exercise;

import java.util.Scanner;

public class TwoHighestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int numOfStudents = input.nextInt();
		
		int score;
		int highest = 0;
		int secondHighest = 0;
		
		String name = " ";
		String student1 = " ";
		String student2 = " ";
		
		System.out.println("Enter each students name and score");
		for(int i = 0; i < numOfStudents; i++){
			System.out.print("Student: " + (i+1) + "\n Name: ");
			name = input.next();
			System.out.print("  Score: ");
			score = input.nextInt();
			
			if(i == 0){
				highest = score;
				student1 = name;
			}
			else if(i == 1 && score > highest){
				secondHighest = highest;
				highest = score;
				student2 = student1;
				student1 = name;
			}
			else if(i == 1){
				secondHighest = score;
				student2 = name;
			}
			else if(i > 1 && score > highest && score > secondHighest){
				secondHighest = highest;
				student2 = student1;
				highest = score;
				student1 = name;
			}
			else if(i > 1 && score > secondHighest){
				student2 = name;
				secondHighest = score;
			}
		}
		
		System.out.println("Highest scoring student: " + student1);
		System.out.println("Second highest student: " + student2);

}
}
