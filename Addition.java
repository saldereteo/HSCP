package suncoastChapter2;
/**
 * 
 * @author Jan
 * Simple class that has only a main method.
 * This class demonstrates basic execution of the main method
 */
public class Addition {

	public static void main(String[] args) {
		int num1 = 24;
		int num2 = 48;
		int num3 = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + num3);
			
		num3 = num2 - num1;
		System.out.println("Difference of  " + num2 + " - " + num1 + " is " + num3);
		
		num3 = num2 * num1;
		System.out.println("Product of  " + num2 + " and " + num1 + " is " + num3);
		
		num3 = num2 / num1;
		System.out.println("Quotient  of  " + num2 + " / " + num1 + " is " + num3);

	}
}
