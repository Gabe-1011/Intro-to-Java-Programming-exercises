package exercise;

public class NumberFormatExceptionCalculator {

	public static void main(String[] args) throws NumberFormatException {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Determine the operator
		try{
			switch (args[1].charAt(0)) {
			case '+':
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-': result = Integer.parseInt(args[0]) -
					Integer.parseInt(args[2]);
			break;
			case '.': result = Integer.parseInt(args[0]) *
					Integer.parseInt(args[2]);
			break;
			case '/': result = Integer.parseInt(args[0]) /
					Integer.parseInt(args[2]);
			}	
		}
		catch(NumberFormatException ex){
			System.out.println(ex);
		}
		
		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
				+ " = " + result);

	}

}
