package exercise;

public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account(1122, 20000);
		a1.setAnnualInterestRate(4.5);
		
		System.out.println("Your current balance is: " + a1.getBalance());
		
		a1.withdraw(2500);
		
		System.out.println("Your current balance is: " + a1.getBalance());
		
		a1.deposit(3000);
		
		System.out.println("Your current balance is: " + a1.getBalance());
		
		System.out.println("Your monthly interest is: " + 
		       a1.getMonthlyInterest());
		
		System.out.println("This account was created on: " + a1.getDate());
		 

	}

}
