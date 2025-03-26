package suncoastChapter2;

import java.util.Scanner;
public class MathMethods {
	public static void main(String[] args) {
		double val;
			Scanner input = new Scanner(System.in);
			val = input.nextDouble();
			System.out.println("val = " + val);	
			System.out.println("Math.abs(val) = " + 
					Math.abs(val));
			System.out.println("Math.floor(val) = " + 
					Math.floor(val)); // double value returned
					// floor round down
			System.out.println("Math.ceil(val) = " + 
					Math.ceil(val)); // double value returned
					// ceil round up
			System.out.println("Math.round(val) = " + 
					Math.round(val));  // int value returned
			System.out.println("Math.pow(val,2.5) = " + 
					Math.pow(val,2.5)); // double value returned
			System.out.println("Math.sqrt(val) = " + 
					Math.sqrt(val)); // double value returned
			System.out.println("Math.PI = " + 
					Math.PI); // double value returned
			System.out.println("Math.E = " + 
					Math.E); // double value returned
			}
}

