package suncoastChapter6;

/**
 * An example of how to input a 2D array from the coommand line
 */
import java.util.Scanner;

public class TwDArrayInput {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + arr[i].length + " integers for row " + i);
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		System.out.println("The array input was:" );
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}