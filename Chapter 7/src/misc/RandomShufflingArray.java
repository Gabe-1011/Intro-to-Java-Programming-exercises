package misc;

public class RandomShufflingArray {

	public static void main(String[] args) {
		double[] myList = {3.0, 5.0, 7.0};
		
		for(int i = myList.length - 1; i > 0; i--){
			// Generate an index j randomly with 0 <= j <= i
			int j = (int)(Math.random() * (i + 1));
			
			// Swap myList[i] with myList[j]
			double temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}
	}

}
