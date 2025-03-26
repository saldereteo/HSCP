package suncoastChapter6;

import java.util.Arrays;
// Demonstrates passing 2 D array to method
public class Pass2DArray {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		System.out.println("Initial array");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Multiply the array entries by 2");
		int[][] prodArray = doProd(array);
		for(int i = 0; i < prodArray.length; i++) {
			for(int j = 0; j < prodArray[i].length; j++) {
				System.out.print(prodArray[i][j] + " ");
			}
			System.out.println();
		}
		
	    System.out.println("\nSum of all elements in initial array is " + sum(array));
	}

	/**
	 * Takes as input a 2 dimensional array Returns a 2 dimensional array with
	 * the same dimensions. Each entry is 2 * the corresponding entry in the
	 * array passed in
	 * 
	 * @param array
	 * @return 2 d array
	 */
	public static int[][] doProd(int[][] array) {
		int[][] arr;
		int rows = array.length;
		arr = new int[rows][array[0].length];

		for (int i = 0; i < array.length; i++) {
			// Get size of each row of existing array
			int columns = array[i].length;
			// Create array for arr[i] with same size the input parameter
			// array[i]
			for (int j = 0; j < array[i].length; j++) {
				arr[i][j] = 2 * array[i][j];
			}
		}
		return arr;
	}

	// Return the sum of all entries in a 2D array
	public static int sum(int[][] m) {
		int total = 0;
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				total += m[row][column];
			}
		}

		return total;
	}

}
