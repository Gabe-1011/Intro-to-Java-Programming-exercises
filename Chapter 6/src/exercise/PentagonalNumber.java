package exercise;

public class PentagonalNumber {

	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		
		System.out.println("The first 100 pentagonal numbers are: \n");
		
		for(int i = 1; i <= 100; i++){
			int pentagonalNumber = getPentagonalNumber(i);
			if(i % NUMBERS_PER_LINE == 0){
				System.out.println(pentagonalNumber);
			}
			else
				System.out.print(pentagonalNumber + " ");
		}

	}
	
	public static int getPentagonalNumber(int n){
		return (n * ((3 * n) - 1)) / 2;
	}

}
