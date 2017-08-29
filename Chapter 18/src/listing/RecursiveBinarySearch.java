package listing;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		

	}
	
	public static int recursiveBinarySearch(int[] list, int key){
		int low = 0;
		int high = list.length - 1;
		return recursiveBinarySearch(list, key, low, high);
	}
	
	private static int recursiveBinarySearch(int[] list, int key,
			int low, int high){
		if(low > high) // list exhausted without match
			return -low - 1;
		
		int mid = (low + high) / 2;
		if(key < list[mid])
			return recursiveBinarySearch(list, key, low, mid - 1);
		else if(key == list[mid])
			return mid;
		else
			return recursiveBinarySearch(list, key, mid + 1, high);
	}

}
