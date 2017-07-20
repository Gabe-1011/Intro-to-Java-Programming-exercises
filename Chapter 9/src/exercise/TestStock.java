package exercise;

public class TestStock {

	public static void main(String[] args) {
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		
		System.out.println(s1.name + "'s previous closing price is "
				+ s1.previousClosingPrice + " and it's current price is "
				+ s1.currentPrice);
		
		System.out.println("The percent changed is " + s1.getChangePercent() + "%");

	}

}
