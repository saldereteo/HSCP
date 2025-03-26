package Patterns;


/**
 * Shows how arrays can be copied
 */
public class CopyArray {
	
	public static void main(String[] args) {
		
		System.out.println("Manual copy of arrays");
		int[] array1 = {1, 2, 3, 4, 5};
		System.out.println("array1");
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " " );
		}
		
		int[] array2 = new int[array1.length];
		
		// Copy array1 into array2 using for loop
		// Make sure to check limits of both arrays
		for(int i = 0; i < array1.length && i < array2.length; i++) {
			array2[i] = array1[i];
		}
		System.out.println();
		System.out.println("Copy array into array2");
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " " );
		}
		System.out.println();
		
	}

}
