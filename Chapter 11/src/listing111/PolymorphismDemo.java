package listing111;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		displayObject(new Circle(1, "red", false)); // polymorphic call
		displayObject(new Rectangle(1, 1, "black", true)); // polymorphic call
		

	}
	
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() +
				". Color is " + object.getColor());
	}

}
