package exercise;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		double[] numbers = {5.0, 3.0, 2.0, 7.0, 17.0, 19.0, 1.0, 29.0, 4.0, 11.0};
		sortArray(numbers);
		
		System.out.println(Arrays.toString(numbers));

	}
	
	public static void sortArray(double[] numbers){
		double temp;
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = i + 1; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

}
