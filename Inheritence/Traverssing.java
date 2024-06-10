public class Traverssing {
	public static void main(String[] args) {
		//Given the provided 2d array
		int[][] intMatrix = {
				{ 4,  6,  8, 10, 12, 14, 16},
				{18, 20, 22, 24, 26, 28, 30},
				{32, 34, 36, 38, 40, 42, 44},
				{46, 48, 50, 52, 54, 56, 58},
				{60, 62, 64, 66, 68, 70, 79}
		};
		int rows = intMatrix.length;
		int columns = intMatrix[0].length;
    
		int sum = 0;
		for(int i=0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
                // Add a line to calculate sum of all elements
				sum+=intMatrix[i][j];
			}
		}
		System.out.println(sum);
	}
}