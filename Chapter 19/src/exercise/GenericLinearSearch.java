package exercise;

public class GenericLinearSearch {

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		
		System.out.println("Finding 5 in array...");
		System.out.println("5 is located in index " + linearSearch(intArray, 5));
	}
	
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
		int index = 0;
		for(int i = 0; i < list.length; i++){
			if(list[i].compareTo(key) == 0){
				index = i;
			}
		}
		
		return index;
	}

}
