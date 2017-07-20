package misc;

public class SumElementsPerColumn {

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				matrix[row][column] = (int)(Math.random() * 100);
			}
		}
		
		for(int column = 0; column < matrix[0].length; column++){
			int total = 0;
			for(int row = 0; row < matrix.length; row++){
				total += matrix[row][column];
			}
			System.out.println("Sum for column " + column + " is "
					+ total);
		}

	}

}
