package suncoastch6;

/**
 * Demonstrates how 2D array can be passed to a method and changed in the method
 * @author 1116444
 *
 */

public class Change2DArray {

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
		 changeArray(array);
		 System.out.println("Contents of original array after return from method");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	/**
	 * Takes as input a 2 dimensional array. Multiplies each entry in the array by 2
	 * 
	 * @param array
	 * @return 2 d array
	 */
	public static void changeArray(int[][] array) {

		// Multiply each entry in array by 2
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i * j;
			}
		}
	}

}
