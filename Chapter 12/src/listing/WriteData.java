package listing;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws IOException {
		File file = new File("scores.txt");
		if(file.exists()){
			System.out.println("File already exists");
			System.exit(0);
		}
		
		// Auto close try with resource
		try(PrintWriter output = new PrintWriter(file)){
			output.print("John T Smith");
			output.println(90);
			output.print("Eric K Jones");
			output.println(85);
		}
		
		// Manual close
//		output.close(); 
		

	}

}
