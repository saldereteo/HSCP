package suncoastChapter4;

import java.util.Scanner;
public class TestMethodOverload {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: " );
		int in1 = input.nextInt();
		System.out.print("Enter another integer: ");
		int in2 = input.nextInt();
		int maxInt = max(in1, in2);
		System.out.println("The max of " + in1 + " and " + in2 + " is " + maxInt);
		
		System.out.println("The max of 2.0 and 3.0 is " + max(2.0, 3.0));
		
		System.out.println("the max of 3.3, 4.2, and -6.8 is " + max(3.3, 4.2, -6.8));
	}
	
	public static int max(int num1, int num2) {
		System.out.println("intMax called");
		int result;
		if (num1 >= num2) {
			result = num1;
		}
		else {
			result = num2;
		}
		return  result;
	}
	
	public static double max(double num1, double num2) {
		System.out.println("double max called");
		double result;
		if (num1 >= num2) {
			result = num1;
		}
		else {
			result = num2;
		}
		return  result;
	}
	
	public static double max(double num1, double num2, double num3) {
		System.out.println("double double max called");
		double result;
		
		return max(max(num1, num2), num3);

	}

}
