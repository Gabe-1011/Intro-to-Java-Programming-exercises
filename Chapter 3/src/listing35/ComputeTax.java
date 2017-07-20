package listing35;

import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your status ?" + "\n" +
		"0 = Single" + "\n" + "1 = Married Jointly or Qualifying Widow(er)" +
		"\n" + "2 = Married Filing Separately" + "\n" + "3 = Head of Household");
		
		int status = in.nextInt();
		
		System.out.println("Enter taxable income");
		
		double income = in.nextDouble();
		
		double tax = 0;

	}
	
	public double calculate(int status, double income, double tax){
		if(status == 0){
			if(income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			
		}
		
		else if (status == 1){
			
		}
	}

}
