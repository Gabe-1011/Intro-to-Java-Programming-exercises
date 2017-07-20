package misc;

public class SumElementsOfTwoDimensionalArray {

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				matrix[row][column] = (int)(Math.random() * 100);
			}
		}
		
		int total = 0;
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				total += matrix[row][column];
			}
		}
		
		System.out.println(total);

	}

}
