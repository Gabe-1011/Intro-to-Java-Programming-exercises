package exercise;

import java.util.ArrayList;

public class OutOfMemoryErrorDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		try{
			while(true){
				list.add("LA LA LAND");
			}
		}
		catch(Throwable t){
			System.out.println("Memory out of bounds.");
		}

	}

}
