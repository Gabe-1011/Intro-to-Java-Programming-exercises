package misc;

public class LargestElementArray {

	public static void main(String[] args) {
		double[] myList = {3.0, 4.0, 5.0};
		
		double max = myList[0];
		for(int i = 1; i < myList.length; i++){
			if(myList[i] > max)
				max = myList[i];
		}
		
		System.out.println(max);

	}

}
