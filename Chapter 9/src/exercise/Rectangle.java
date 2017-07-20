package exercise;

public class Rectangle {
	public double width;
	public double height;
	
	public Rectangle(){
		width = 1;
		height = 1;
	}
	
	public Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return (2 * width) + (2 * height);
	}

}
