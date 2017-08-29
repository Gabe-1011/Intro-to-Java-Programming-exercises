package listing;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// Create hash set
		Set<String> set = new HashSet<>();
		
		// Add strings to set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
		
		for(String s: set){
			System.out.print(s.toUpperCase() + " ");
		}

	}

}
