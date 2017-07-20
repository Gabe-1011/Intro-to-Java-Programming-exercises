package exercise;

public class TestQueue {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		for(int i = 0; i < 20; i++){
			queue.enqueue(i + 1);
		}
		
		for(int i = 0; i < 20; i++){
			System.out.print(queue.dequeue() + ", ");
		}

	}

}
