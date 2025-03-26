package suncoastChapter6;
import java.util.Scanner;

/**
 * Shows how to reate and initialize arrays
 * @author Jan
 *
 */
public class InitialArrayDemo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Declaring array
		int[] array1;

		//creating array
		array1 = new int[5];
		
		// Initializing array entries
		array1[0] = 0;
		
		array1[1] = 2;
		array1[2] = 4;
		array1[3] = 6;
		array1[4] = 8;
		// Displaying an array
		for(int i = 0; i < array1.length; i++) {
			System.out.print( array1[i] + " ");
		}
		System.out.println();
		
		System.out.println("Initialize array from console");
		System.out.print("enter the number of array elements: ");
		int count;
		count = input.nextInt();
		
		//Declare array and create on same line.
		// Note that array size can be a variable
		int[] inputArray = new int[count];
		
		System.out.print("enter the values: " );
		for(int i = 0; i < inputArray.length; i++) {
			inputArray[i] = input.nextInt();
		}
		
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
		
		// default values for array entries:
		System.out.println("Uninitialized array");
		int[] array2 = new int[5];
		System.out.println("Value of uninitialized entry array2[2] = " + array2[2]);
		
		System.out.println("Printing out integer array reference");
		System.out.println(array2);
		
		//Array initializer
		char[] c = {'A', 'B', 'C', 'D'};
		
		// print character array
		
		System.out.println("Initialized character array printed. Note that printing the array reference prints the entries in this case: ");
		System.out.println(c);
		
		// Another way to use the initializer
		char[] d = new char[] {'A', 'B', 'C', 'D'};
		
		// Sum array entries
		
		int total = 0;
		for(int i = 0; i < array1.length; i++) {
			total += array1[i];
		}
		System.out.println("Sum of array1 entries = " + total);
		
		// Now do it with Strings
		System.out.println("String array");
		String[] strArray = {"abc", "efg", "hij"};
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}

}
