package exercise;

import java.util.Scanner;

public class LettersInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		
		String word = input.nextLine();
		
		System.out.println("There are " + countLetters(word) + " letters in " + word);

	}
	
	public static int countLetters(String s){
		int numberOfLetters = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(Character.isLetter(s.charAt(i))){
				numberOfLetters++;
			}
		}
		
		return numberOfLetters;
	}

}
