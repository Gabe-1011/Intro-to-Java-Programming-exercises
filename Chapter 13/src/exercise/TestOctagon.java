package exercise;

public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon octagon = new Octagon(5);
		System.out.println(octagon.toString());
		Octagon octagon2 = (Octagon)octagon.clone();
		
		int result = (octagon.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");

	}

}
