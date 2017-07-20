package exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class ShuffleArrayListNumber {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(45);
		list.add(360.54);
		list.add(new BigInteger("3432323234344343101"));
		list.add(new BigDecimal("2.0909090989091343433344343"));

		System.out.println(list.toString());

		shuffle(list);

		System.out.println(list.toString());

		sort(list);

		System.out.println(list.toString());

	}

	public static void shuffle(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			int index = (int) (Math.random() * list.size());
			int currentIndex = list.indexOf(list.get(i));
			list.add(index, list.get(currentIndex));
			list.remove(list.get(currentIndex));
		}
	}

	/** Sorts an ArrayList of numbers */
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			// Find the mimimum in the list
			Number min = list.get(i); // minimum number
			int minIndex = i; 

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			// Swap list.get(i) with list.get(minIndex) if necessary
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}
		}
	}
}
