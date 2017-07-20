package exercise;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}

		checkAccount(accounts, input);

	}

	public static int menu(Scanner input) {
		System.out.println("Main menu\n" + "1: Check Balance\n" + "2: withdraw\n" + "3: deposit\n" + "4: exit\n"
				+ "Enter a choice: ");
		return input.nextInt();
	}

	public static void checkAccount(Account[] accounts, Scanner input) {
		do {
			System.out.println("Enter an id: ");
			int id = input.nextInt();
			int choice;
			do {
				choice = menu(input);
				switch (choice) {
				case 1:
					System.out.println("The balance is: " + accounts[id].getBalance());
					break;
				case 2:
					System.out.print("Enter an amount to withdraw: ");
					accounts[id].withdraw(input.nextDouble());
					break;
				case 3:
					System.out.print("Enter an amount to deposit: ");
					accounts[id].deposit(input.nextDouble());

				}
			} while (choice != 4);

		} while (true);

	}
}
