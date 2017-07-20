package exercise;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(234));
		
	}
	
	public static int sumDigits(long n){
		int sum = 0;
		while(n != 0){
			sum += (n % 10);
			long newNum = n / 10;
			n = newNum;
		}
		return sum;
	}

}
