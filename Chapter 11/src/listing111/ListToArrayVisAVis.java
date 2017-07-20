package listing111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListToArrayVisAVis {

	public static void main(String[] args) {
		// Array to list
		String[] array = {"red", "green", "blue"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		System.out.println(list.toString());
		
		// list to array
		String[] array1 = new String[list.size()];
		list.toArray(array1);
		
		System.out.println(array1.toString());
		
		// sort a list
		Integer[] array2 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
		Collections.sort(list2);
		System.out.println(list2);
		
		// max and min
		Integer[] array3 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(array3));
		System.out.println(java.util.Collections.max(list3));
		System.out.println(java.util.Collections.min(list3));
		
		// shuffle
		Integer[] array4 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
		ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(array4));
		Collections.shuffle(list4);
		System.out.println(list4);

	}

}
