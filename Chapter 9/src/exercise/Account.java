package exercise;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	public int getId(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	public String getDate(){
		return dateCreated.toString();
	}
	
	public double getMonthlyInterestRate(){
		annualInterestRate = annualInterestRate / 100;
		
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest(){
		annualInterestRate = annualInterestRate / 100;
		double monthlyInterestRate = annualInterestRate / 12;
		return balance * monthlyInterestRate;
	}
	
	public void withdraw(double moneyWithdrew){
		balance = balance - moneyWithdrew;
	}
	
	public void deposit(double moneyDeposited){
		balance = balance + moneyDeposited;
	}

}
