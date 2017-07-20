package listing;

public class TestCircleWithCustomException {

	public static void main(String[] args) {
		try{
			new CircleWithException_Custom(5);
			new CircleWithException_Custom(-5);
			new CircleWithException_Custom(0);
		}
		catch(InvalidRadiusException ex){
			System.out.println(ex);
		}
		
		System.out.println("Number of objects: " +
				CircleWithException_Custom.getNumberOfObjects());

	}

}
