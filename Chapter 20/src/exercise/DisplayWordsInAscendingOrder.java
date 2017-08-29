package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DisplayWordsInAscendingOrder {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		File file = new File("words.txt");
		
		if(!file.exists()){
			System.out.println("File doesn't exist.");
			System.exit(0);
		}
		
		try(Scanner input = new Scanner(file)){
			while(input.hasNext()){
				list.add(input.next());
			}
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		
		Collections.sort(list);
		System.out.println(list);

	}

}
