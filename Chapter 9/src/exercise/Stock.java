package exercise;

public class Stock {
	public String symbol;
	public String name;
	public double previousClosingPrice;
	public double currentPrice;
	
	public Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
		previousClosingPrice = 34.5;
		currentPrice = 34.35;
	}
	
	public double getChangePercent(){
		return (((currentPrice - previousClosingPrice)/ currentPrice) * 100);
	}

}
