package exercise425;

public class VehiclePlate {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++){
			int randNum = (int) (Math.random() * 26) + 1;
			System.out.printf(String.valueOf((char)(randNum + 64)));
		}
		
		for(int j = 0; j < 4; j++){
			int number = (int) (Math.random() * 10);
			System.out.printf(number + "");
		}

	}

}
