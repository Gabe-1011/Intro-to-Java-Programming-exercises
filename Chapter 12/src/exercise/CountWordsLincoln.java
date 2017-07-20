package exercise;

import java.io.File;
import java.util.Scanner;

public class CountWordsLincoln {

	public static void main(String[] args) throws Exception {
		File file = new File("lincoln.txt");
		
		if (!file.exists()) {
			System.out.println("File " + file + " does not exist");
			System.exit(1);
		}
		
		int numOfWords = 0;
		
		try(Scanner input = new Scanner(file)){
			while(input.hasNext()){
				String line = input.next();
				numOfWords++;
			}
		}
		
		System.out.println(numOfWords + " words");

	}

}
