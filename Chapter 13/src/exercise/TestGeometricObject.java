package exercise;

public class TestGeometricObject {

	public static void main(String[] args) {
		GeometricObject[] objects = {new Square(4.0), new Circle(2.0),
				new Rectangle(3.0, 5.0), new Square(7.0)};
		
		for(int i = 0; i < objects.length; i++){
			if(objects[i] instanceof Colorable){
				System.out.println(i + 1);
				((Square)objects[i]).howToColor();
			}
		}
		
		System.out.println("The sum of all the areas in the array is " + 
				sumArea(objects));

	}
	
	public static double sumArea(GeometricObject[] a){
		// Initialize sum
		double sum = 0;
		
		// Add area of each object in the array to sum
		for(int i = 0; i < a.length; i++){
			sum += a[i].getArea();
		}
		
		return sum;
	}

}
