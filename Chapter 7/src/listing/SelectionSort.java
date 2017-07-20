package listing;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = {4, 2, 6, 1, 8, 5};
		selectionSort(numbers);
		
		System.out.println(Arrays.toString(numbers));

	}
	
	public static void selectionSort(int[] list){
		for(int i = 0; i < list.length - 1; i++){
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for(int j = i + 1; j < list.length; j++){
				if(currentMin > list[j]){
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i){
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

}