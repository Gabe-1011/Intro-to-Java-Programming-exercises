
public class RandomMonth {

	public static void main(String[] args) {
		int monthNumber = (int) (Math.random() * 12);
		
		switch(monthNumber){
		case 1: System.out.println("January");
				break;
		case 2: System.out.println("February");
				break;
		case 3: System.out.println("March");
		        break;
		case 4: System.out.println("April");
		        break;
		default: System.out.println("I get it");
		}

	}

}
