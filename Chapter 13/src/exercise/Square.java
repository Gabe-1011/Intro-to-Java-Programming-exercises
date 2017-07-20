package exercise;

public class Square extends GeometricObject implements Colorable {
	private double side;
	
	public Square(){
		
	}
	
	public Square(double side){
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled){
		super(color, filled);
		this.side = side;
	}
	

	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side * 4;
	}

}
