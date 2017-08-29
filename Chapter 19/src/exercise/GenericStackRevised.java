package exercise;

public class GenericStackRevised<E> {
	private E[] arr;
	private int size;

	@SuppressWarnings("unchecked")
	public GenericStackRevised() {
		arr = (E[]) new Object[100];
	}

	/** Push a new integer to the top of the stack */
	@SuppressWarnings("unchecked")
	public void push(E value) {
		if (size >= arr.length) {
			E[] temp = (E[]) new Object[arr.length * 2];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}

		arr[size++] = value;
	}

	/** Return and remove the top element from the stack */
	public E pop() {
		return arr[--size];
	}

	/** Return the top element from the stack */
	public E peek() {
		return arr[size - 1];
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** Return the number of elements in the stack */
	public int getSize() {
		return size;
	}

}
