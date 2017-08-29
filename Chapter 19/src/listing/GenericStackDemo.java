package listing;

public class GenericStackDemo {

	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		
		GenericStack<Integer> stack2 = new GenericStack<>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		

	}

}
