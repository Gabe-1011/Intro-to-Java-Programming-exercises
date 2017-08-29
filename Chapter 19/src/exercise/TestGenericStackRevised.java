package exercise;

public class TestGenericStackRevised {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		GenericStackRevised stack = new GenericStackRevised();
		
		for (int i = 0; i < 10; i++)
			stack.push(i);
		
		while (!stack.empty())
			System.out.print(stack.pop() + " ");

	}

}
