package misc;

public class LargestSumOfRow {

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				matrix[row][column] = (int)(Math.random() * 100);
			}
		}
		
		int maxRow = 0;
		int indexOfMaxRow = 0;
		
		// Get sum of the first row in maxRow
		for(int column = 0; column < matrix[0].length; column++){
			maxRow += matrix[0][column];
		}
		
		for(int row = 1; row < matrix.length; row++){
			int totalOfThisRow = 0;
			for(int column = 0; column < matrix[row].length; column++){
				totalOfThisRow += matrix[row][column];
			}
			
			if(totalOfThisRow > maxRow){
				maxRow = totalOfThisRow;
				indexOfMaxRow = row;
			}
		}
		
		System.out.println("Row " + indexOfMaxRow
				+ " has the maximum sum of " + maxRow);

	}

}
