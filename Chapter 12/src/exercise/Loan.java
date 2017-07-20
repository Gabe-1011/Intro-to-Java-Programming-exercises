package exercise;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numberOfYears,
			double loanAmount){
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new java.util.Date();
	}
	
	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		if(annualInterestRate > 0.0){
			this.annualInterestRate = annualInterestRate;
		}
		else
			throw new IllegalArgumentException("Annual interest rate is" +
					" less than or equal to zero.");
	}
	
	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		if(numberOfYears > 0){
			this.numberOfYears = numberOfYears;
		}
		else
			throw new IllegalArgumentException("Number of years is less than zero.");
	}
	
	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}
	
	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		if(loanAmount > 0.0){
			this.loanAmount = loanAmount;
		}
		else
			throw new IllegalArgumentException("Loan amount is less than or equal to zero");
	}
	
	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	
	

}
