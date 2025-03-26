package suncoastChapter4;

import java.util.Scanner;
public class AmbiguousOverload {
	
	public static void main(String[] args) {
		System.out.println(max(1,2));

	}
	
	public static double max(int num1, double num2) {
		System.out.println("intMax called");
		double result;
		if (num1 >= num2) {
			result = num1;
		}
		else {
			result = num2;
		}
		return  result;
	}
	
	public static double max(double num1, int num2) {
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


}
