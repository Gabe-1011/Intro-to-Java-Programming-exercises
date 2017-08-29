package listing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DetectEndOfFile {

	public static void main(String[] args) {
		try{
			try(DataOutputStream output =
					new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.dat")))){
				output.writeDouble(4.5);
				output.writeDouble(43.2);
				output.writeDouble(3.2);
			}
			
			try(DataInputStream input =
					new DataInputStream(new BufferedInputStream(new FileInputStream("test.dat")))){
				while(true)
					System.out.println(input.readDouble());
			}
		}
		catch(EOFException ex){
			System.out.println("All data were read");
		}
		catch(IOException ex){
			ex.printStackTrace();
		}

	}

}
