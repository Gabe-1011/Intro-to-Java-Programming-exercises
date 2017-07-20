package exercise118;

public class Demo {

	public static void main(String[] args) {
		Account account = new Account("George", 1122, 1000);
		System.out.println("Account created on: " + account.getDate());
		
		System.out.println("Depositing...");
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		
		System.out.println("Withdrawing...");
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.println(account.toString());

	}

}
