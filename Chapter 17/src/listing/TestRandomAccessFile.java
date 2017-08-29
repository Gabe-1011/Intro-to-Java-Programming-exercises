package listing;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {

	public static void main(String[] args) throws IOException {
		try(RandomAccessFile inout = new RandomAccessFile("input.dat", "rw");	
		){
			inout.setLength(0);
			
			// Write new integers to the file
			for(int i = 0; i < 200; i++)
				inout.writeInt(i);
			
			// Display the current length 
			System.out.println("Current file length is " + inout.length());
			
			// Retrieve the first number
			inout.seek(0); // Move to beginning
			System.out.println("The first number is " + inout.readInt());
			
			// Second number
			inout.seek(1 * 4);
			System.out.println("The second number is " + inout.readInt());
			
			// Tenth number
			inout.seek(9 * 4);
			System.out.println("The tenth number is " + inout.readInt());
			
			// Modify eleventh number
			inout.writeInt(555);
			
			// Append new number
			inout.seek(inout.length()); // move to end
			inout.writeInt(999);
			
			// Display new length
			System.out.println("The new length is " + inout.length());
			
			// Retrieve the new eleventh number
			inout.seek(10 * 4);
			System.out.println("The eleventh number is " + inout.readInt());
	
		}

	}

}
