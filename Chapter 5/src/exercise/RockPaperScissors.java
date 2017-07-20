package exercise;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Rock-Paper-Scissors Game");
		
		int numOfWinsUser = 0;
		int numOfWinsComp = 0;
		
		int[] arr = {0, 1, 2};
		
		while(numOfWinsUser <= 2 || numOfWinsComp <= 2){
			int compAns = arr[(int) (Math.random() * 3)];
			System.out.println(compAns);
			System.out.println("Num of wins user: " + numOfWinsUser);
			System.out.println("Num of wins comp: " + numOfWinsComp);
			System.out.println("User, what is your answer?");
			int userAns = input.nextInt();
			if(compAns == 0){
				if(userAns == 0){
					System.out.println("It's a tie");
				}
				else if(userAns == 1){
					numOfWinsUser++;
					System.out.println("User wins!");
				}
				else if(userAns == 2){
					numOfWinsComp++;
					System.out.println("Computer wins!");
				}
			}
			if(compAns == 1){
				if(userAns == 0){
					numOfWinsComp++;
					System.out.println("Computer wins!");
				}
				else if(userAns == 1){
					System.out.println("It's a tie!");
				}
				else if(userAns == 2){
					numOfWinsUser++;
					System.out.println("User wins!");
				}
			}
			if(compAns == 2){
				if(userAns == 0){
					numOfWinsUser++;
					System.out.println("User wins!");
				}
				else if(userAns == 1){
					numOfWinsComp++;
					System.out.println("Comp wins!");
				}
				else if(userAns == 2){
					System.out.println("It's a tie!");
				}
			}
		}
		
		if(numOfWinsComp == 2){
			System.out.println("User won the game!");
		}
		else if(numOfWinsUser == 2){
			System.out.println("Computer won the game!");
		}

	}

}
