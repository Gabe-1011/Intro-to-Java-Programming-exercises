package exercise;

public class StrictlyIdenticalArrays {

	public static void main(String[] args) {
		int[] array1 = {3, 4, 5};
		int[] array2 = {3, 4, 6};
		
		if(equals(array1, array2) == true)
			System.out.println("Two lists are strictly identical");
		else
			System.out.println("Two lists are not strictly identical");

	}
	
	public static boolean equals(int[] list1, int[] list2){
		boolean equal = true;
		
		for(int i = 0; i < list1.length; i++){
			if(list1[i] != list2[i]){
				equal = false;
			}
		}
		
		return equal;
	}

}
