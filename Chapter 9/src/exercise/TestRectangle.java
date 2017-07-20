package exercise;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(40, 4);
		Rectangle r2 = new Rectangle(35.9, 3.5);
		
		System.out.println("The width of rectangle 1 is " + r1.width
				+ " and the height is " + r1.height);
		System.out.println("It's area is " + r1.getArea()
				+ " and its perimeter is " + r1.getPerimeter());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("The width of rectangle 2 is " + r2.width
				+ " and the height is " + r2.height);
		System.out.println("It's area is " + r2.getArea()
				+ " and its perimeter is " + r2.getPerimeter());

	}

}
