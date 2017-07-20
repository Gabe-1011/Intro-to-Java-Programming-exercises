package exercise;

public class Tuition {

	public static void main(String[] args) {
		double tuition = 10000;
		
		System.out.println("Initially, tuition fee is at $" + (int)tuition);
		
		for(int i = 0; i < 10; i++){
			tuition = tuition * 1.05;
		}
		
		System.out.println("After ten years, the tuition is $" + (int)tuition);
		
		int total = 0;
		for(int j = 0; j < 4; j++){
			tuition = tuition * 1.05;
			total += tuition;
		}
		
		System.out.println("After ten years, the tuition for four years is $" + total);
	}

}
