package exercise;

public class TestStopWatch {

	public static void main(String[] args) {
		int[] numbers = new int[100000];
		Stopwatch s1 = new Stopwatch();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		
		System.out.println(selectionSort(numbers, s1));

	}

	public static long selectionSort(int[] list, Stopwatch watch) {
		long startTime = watch.start();
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		
		long endTime = watch.stop();
		long elapsed = watch.getElapsedTime();
		return elapsed;
	}

}
