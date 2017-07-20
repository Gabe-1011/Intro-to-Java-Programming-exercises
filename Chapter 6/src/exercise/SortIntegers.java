package exercise;

public class SortIntegers {

	public static void main(String[] args) {
		double n1 = 3.0;
		double n2 = 2.0;
		double n3 = 7.0;
		
		displaySortedNumbers(n1, n2, n3);
		
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		double temp;
		
		if (num2 < num1 && num2 < num3){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if(num3 < num1 && num3 < num2){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num3 < num2){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}

}
