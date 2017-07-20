package misc;

public class ShiftingElementsArray {

	public static void main(String[] args) {
		double[] myList = {5.0, 8.0, 1.0};
		
		double temp = myList[0];
		for(int i = 1; i < myList.length; i++){
			myList[i - 1] = myList[i];
		}
		
		myList[myList.length - 1] = temp;

	}

}
