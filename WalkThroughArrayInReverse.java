package Patterns;


/**
 * Demonstrates how to walk through an array from last element to first
 * @author 1116444
 *
 */
public class WalkThroughArrayInReverse {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
	}
}
