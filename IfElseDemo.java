package suncoastChapter3;

import java.util.Scanner;
public class IfElseDemo {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			int value = input.nextInt();
			if (value % 2 == 0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");
			}
			if (value % 5 == 0) {
				System.out.println("Number divisible by 5");
			} else {
				System.out.println("Number is not divisible by 5");
			}
		}
}
