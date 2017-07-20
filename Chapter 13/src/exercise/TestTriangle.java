package exercise;

public class TestTriangle {

	public static void main(String[] args) {
		try{
			Triangle triangle = new Triangle(3.0, 2.0, 7.0, "white", true);
			System.out.println(triangle.toString());
		}
		catch(IllegalTriangleException ex){
			System.out.println("The sides you entered are invalid.");
			System.out.println(ex.getMessage());
		}

	}

}
