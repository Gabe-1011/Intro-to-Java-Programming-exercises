package exercise;

import java.io.File;
import java.io.PrintWriter;

public class CreateTextFile {

	public static void main(String[] args) throws Exception {
		File file = new File("Exercise17_01.txt");
		if(file.exists()){
			System.out.println("file already exists");
			System.exit(0);
		}
		
		try(PrintWriter output = new PrintWriter(file);
		){
			for(int i = 0; i < 100; i++){
				output.print(i + " ");
			}
		}

	}

}
