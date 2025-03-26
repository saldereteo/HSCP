package suncoastChapter3;


import java.util.Scanner;
public class ConditionalExpressionDemo {
	public static void main(String[]  args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num = input.nextInt();
		int oldWay;
		// Assign y using if
		if (num > 0) {
			oldWay = 1;
		} else {
			oldWay = -1;
		}
		int betterWay;
		// Better way, using conditional expression
		// betterWay is assigned 1 if num > 0. -1 otherwise
		betterWay = (num > 0)? 1 : -1;
		
	}

}
