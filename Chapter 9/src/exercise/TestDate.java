package exercise;

import java.util.Date;
import java.util.Random;

public class TestDate {

	public static void main(String[] args) {
		Date date = new Date();
		Random random = new Random(1000);
		
		date.setTime(100);
		
		System.out.println(date);
		
		for(int i = 0; i < 50; i++){
			System.out.println(random.nextInt(100));
		}
		
		

	}

}
