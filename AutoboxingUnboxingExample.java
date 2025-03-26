package suncoastChapter6;


/**
 * Demonstrates the use of AutoBoxing and Unboxing
 * AutoBoxing - Automatically Convert int to Integer to store in ArrayList
 * Unboxing - Convert Integer to int
 */
import java.util.ArrayList;

public class AutoboxingUnboxingExample {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		// Autoboxing example
		System.out.println("Autoboxing: Add int values to ArrayList. Autoconvernt to Integer");
		for(int i = 0; i < 5; i++) {
			arr1.add(i);
		}
		
		for(int i = 0; i < arr1.size(); i++) {
			System.out.println("Entry " + i + " of arraylist is " + arr1.get(i));
		}
		
		// Unboxing example
		int sum = 0;
		for(int i = 0; i < arr1.size(); i++) {
			sum += arr1.get(i);
		}
		
		System.out.println("Unboxing example - take sum of ArrayList Integer values. Convert each to int");
		System.out.println("Sum of entries in arraylist is " + sum);
		
		//Now let's autobox again
		arr1.add(sum);
	}
}
