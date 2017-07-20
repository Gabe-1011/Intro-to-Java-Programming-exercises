package exercise317;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		int computer = (int) (Math.random() * 2);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 0 = Scissor 1 = rock 2 = paper");
		
		int user = in.nextInt();

		switch(computer){
		case 0: System.out.println("The computer is scissors");
		        break;
		case 1: System.out.println("The computer is rock");
		        break;
		case 2: System.out.println("The computer is paper");
		        break;
		}
		
		switch(user){
		case 0: System.out.println("The user is scissors");
		        break;
		case 1: System.out.println("The user is rock");
		        break;
		case 2: System.out.println("The user is paper");
		        break;
		}
		
		if(user > computer){
			System.out.println("You won");
		}
		else if(user == computer){
			System.out.println("It's a draw");
		}
		else{
			System.out.println("The computer won");
		}
		
		in.close();
	}

}
