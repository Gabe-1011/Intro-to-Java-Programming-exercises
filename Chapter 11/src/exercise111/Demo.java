package exercise111;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three sides: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("Enter a color: ");
		String color = input.next();
		
		System.out.println("Enter true for filled or \n false for colored.");
		
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3,
				color, filled);
		
		displayData(triangle);
		input.close();

	}
	
	public static void displayData(Triangle triangle){
		System.out.println("The area of the triangle is: " + triangle.getArea());
		System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
		System.out.println("The color of the triangle is: " + triangle.getColor());
		System.out.println("Triangle filled? " + triangle.isFilled());
	}

}
