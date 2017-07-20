package exercise;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;

	public Octagon() {

	}

	public Octagon(double side) {
		this.side = side;
	}

	public Octagon(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	@Override
	public double getArea() {
		return ((2 + (4 / Math.sqrt(2))) * side * side);
	}

	@Override
	public double getPerimeter() {
		return side * 8;
	}

	@Override /** Retrun a String description of this Octagon object */
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}

}
