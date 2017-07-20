package exercise31;

import java.util.Scanner;

public class CheckDiscriminant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter three values for a, b, and c");

		double a = in.nextDouble();

		double b = in.nextDouble();

		double c = in.nextDouble();

		double discriminant = Math.pow(b, 2) - (4 * a * c);

		double r1 =  (-b + Math.pow(discriminant, 0.5) / (2 * a));
		double r2 =  (-b - Math.pow(discriminant, 0.5) / (2 * a));

		if (discriminant > 0) {
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		} else if (discriminant == 0) {
			System.out.println("The equation has one root " + r1);
		}

		else {
			System.out.println("The equation has no real roots");
		}
		
		in.close();

	}

}
