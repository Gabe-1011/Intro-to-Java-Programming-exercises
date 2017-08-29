package listing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) throws IOException {
		try(
			DataOutputStream output = new DataOutputStream
				(new BufferedOutputStream((new FileOutputStream("temp.dat"))));
		){
			// Write student test scores to the file
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeUTF("Jim");
			output.writeDouble(185.5);
			output.writeUTF("George");
			output.writeDouble(105.25);
		}
		
		try( // Create input stream
			DataInputStream input =
				new DataInputStream(new BufferedInputStream((new FileInputStream("temp.dat"))));
		) {
			// Read student test scores
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
		}

	}

}
