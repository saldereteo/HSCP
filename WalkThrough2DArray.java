package twoDArrayPatterns;

/**
 * Demonstrates how to walk through two d array from first element to last
 * @author 1116444
 *
 */
public class WalkThrough2DArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3, 4, 5},{ 6, 7, 8, 9, 10}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Row " + i + " Column " + j + " = " + arr[i][j]);
			}
		}
		
	}
}
