package exercise;

public class TestLoanException {

	public static void main(String[] args) {
		try{
			Loan loan = new Loan(0.0, 5, 2.5);
		}
		catch(IllegalArgumentException ex){
			System.out.println("One of the inputs is invalid.");
		}

	}

}
