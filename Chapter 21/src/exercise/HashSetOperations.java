package exercise;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetOperations {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Blake");
		set1.add("Kevin");
		set1.add("Michael");

		System.out.println("Set 1 is\n" + set1);

		Set<String> set2 = new LinkedHashSet<>();
		set2.add("George");
		set2.add("Katie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");

		System.out.println("Set 2 is \n" + set2);

		Set<String> set3 = (Set<String>) ((LinkedHashSet) set1).clone();
		System.out.println(set3);

		Set<String> set4 = (Set<String>) ((LinkedHashSet) set2).clone();

		// Union
		set3.addAll(set4);
		System.out.println("\nAfter adding set4 to set3, set3 is " + set3);

		// Difference
		set3.removeAll(set4);
		System.out.println("After removing set4 from set3, set3 is " + set3);

		// Intersection
		set3.retainAll(set4);
		System.out.println("After removing common elements in set2 " + "from set1, set1 is " + set3);

	}

}
