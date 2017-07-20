package exercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountNumberOfWordsFile {

	public static void main(String[] args) throws IOException {
		File file = new File("numOfWords.txt");

		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}

		try (PrintWriter output = new PrintWriter(file)) {
			output.print("This is a test");
		}

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				lineCount++;
				String line = input.nextLine();
				charCount += line.length();
			}
		}

		try (
				// Create input file
				Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String line = input.next();
				wordCount++;
			}
		}

		// Display results
		System.out.println("File " + file.getName() + " has");
		System.out.println(charCount + " characters");
		System.out.println(wordCount + " words");
		System.out.println(lineCount + " lines");
	}

}
