package exercise1111;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(124);
		list.add(15);
		list.add(23);
		list.add(7);
		
		sort(list);
		System.out.println(list.toString());
	}
	
	public static void sort(ArrayList<Integer> list){
		Collections.sort(list);
	}

}
