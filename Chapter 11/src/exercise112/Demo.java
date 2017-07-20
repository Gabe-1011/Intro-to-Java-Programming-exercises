package exercise112;

public class Demo {

	public static void main(String[] args) {
		Person person = new Person("Gabe", "111", "631",
				"gabepurugs@gmail.com");
		
		System.out.println(person.toString());
		
		System.out.println();
		
		Student student = new Student("Gabe", "111", "631",
				"gabepurugs@gmail.com", 3);
		
		System.out.println(student.toString());
		
		System.out.println();
		
		Employee employee = new Employee("Gabe", "111", "631",
				"gabepurugs@gmail.com", "NYC", 3000.0);
		
		System.out.println(employee.toString());

	}

}
