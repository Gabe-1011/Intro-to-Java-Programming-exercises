package misc;

public class SumOfElementsArray {

	public static void main(String[] args) {
		double[] myList = {2.0, 3.0, 4,0};
		
		
		double total = 0;
		for(int i = 0; i < myList.length; i++){
			total += myList[i];
		}
		
		System.out.println(total);
	}

}
