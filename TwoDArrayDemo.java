package suncoastChapter6;
// Demonstrates creation and use of 2 D array
import java.util.Arrays;
public class TwoDArrayDemo {
	
	public static void main(String[] args) {
			
		int [][] twoDArray;  // declare a two D array
		twoDArray = new int[2][3]; // Create a 2 D array
		
		int[][] intArray1 = new int[2][3]; // Declare and Create a two D array
		
		// Initialize with assignment statements
		intArray1[0][0] = 2;
		intArray1[0][1] = 3;
		System.out.println("Number of rows in intArray1 = " + intArray1.length);
		
		// Get number of columns in each row
		for(int row = 0; row < intArray1.length; row++) {
				System.out.println("Number of columns in intArray1 row " + row + " = " + intArray1[row].length);
		}
		
		// Initialize 2D array with nested for loop
		for(int row = 0; row < intArray1.length; row++) {
			for(int col = 0; col < intArray1[row].length; col++) {
				intArray1[row][col] = row * 10  + col;
			}
		}
		// Print out entries in 2D array
		// Initialize 2D array with nested for loop
		System.out.println("2D Array initialized with nested for loops");
		for(int row = 0; row < intArray1.length; row++) {
			for(int col = 0; col < intArray1[row].length; col++) {
				System.out.print(intArray1[row][col] + " ");
			}
			System.out.println();
		}
		
		
		// Declare, create, and initialize a 2 D array with initializer
			
		int[][] intArrayTest =  { // 3 rows, 3 columns per row
				{1, 9, 2},
				{4, 5, 6},
				{7, 3, 1}
				};


		System.out.println("Number of rows in intArrayTest = " + intArrayTest.length);
		for(int ind = 0; ind < intArrayTest.length; ind++) {
			System.out.println("Number of columns in row " + ind + " = " + intArrayTest[ind].length);
		}

		for(int i = 0; i < intArrayTest.length; i++) {
			for(int j = 0; j < intArrayTest[i].length; j++) {
				System.out.print(intArrayTest[i][j]  + " ");
			}
			System.out.println();
		}
		
		System.out.println("Printing out a 2D array with foreach");
		for(int[] arr: intArrayTest) {
			for(int entry: arr) {
				System.out.print(entry + " ");
			}
			System.out.println();
		}
		
		// Which row has largest sum
		System.out.println("Which row in intArrayTest has largest sum");
		int maxRow = 0;
		int indexOfMaxRow = 0;
		for(int i = 0; i < intArrayTest.length; i++) {
			// Initialize the total for each row 
			// AFTER starting the iteration for the row and  BEFORE
			// cycling through the columns in the row
			int rowTotal = 0;
			for(int j = 0; j < intArrayTest[i].length; j++) {
				rowTotal += intArrayTest[i][j];
			}
			System.out.println("Sum of row " + i + " = " + rowTotal);
			if (rowTotal >= maxRow) {
				maxRow = rowTotal;
				indexOfMaxRow = i;
			}
		}
		System.out.println("Max sum = " + maxRow + " For row " + indexOfMaxRow);
	}

}
