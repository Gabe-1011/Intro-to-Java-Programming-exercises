package exercise;

public class MyInteger {
	public int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		if (value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(){
		if(value % 2 != 0)
			return true;
		else
			return false;
	}
	
	public boolean isPrime(){
		if(value % 2 == 0)
			return false;
		for(int i = 3; i * i <= value; i += 2){
			if(value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int value){
		if (value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int value){
		if(value % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int value){
		if(value % 2 == 0)
			return false;
		for(int i = 3; i * i <= value; i += 2){
			if(value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger value){
		return value.isEven();
	}
	
	public static boolean isOdd(MyInteger value){
		return value.isOdd();
	}
	
	public static boolean isPrime(MyInteger value){
		return value.isPrime();
	}
	
	public boolean equals(int value){
		if (this.value == value){
			return true;
		}
		else
			return false;
	}
	
	public boolean equals(MyInteger value){
		return value.equals(value);
	}
	
	public static int[] parseInt(char[] charArr){
		int[] intArr = new int[charArr.length];
		
		for(int i = 0; i < charArr.length; i++){
			intArr[i] = Integer.valueOf(charArr[i]);
		}
		
		return intArr;
	}
	
	public static int parseInt(String value){
		return Integer.parseInt(value);
	}
	
	

}
