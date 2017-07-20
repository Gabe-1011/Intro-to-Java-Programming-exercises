package exercise;

public class TestCourse {

	public static void main(String[] args) {
		Course course = new Course("CST246");
		String[] students = course.getStudents();
		
		course.addStudent("Gabe Purugganan");
		course.addStudent("Kang Penas");
		course.addStudent("Edrhel Damiles");
		
		System.out.println("The students in " + course.getCourseName() +
				" are ");
		for(int i = 0; i < course.getNumberOfStudents(); i++){
			System.out.print(students[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("After deletion....");
		
		course.dropStudent("Gabe Purugganan");
		
		System.out.println("The students in " + course.getCourseName() +
				" are ");
		for(int i = 0; i < course.getNumberOfStudents(); i++){
			System.out.print(students[i] + " ");
		}
		
	}

}
