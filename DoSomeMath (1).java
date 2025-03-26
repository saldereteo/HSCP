package suncoastChapter2; // Identifies what package the class belongs to

/**
 * 
 * @author Jan
 * Simple class that has only a main method and another static method.
 * This class demonstrates basic execution of a main method and related static methods in a class,
 * to implement a procedure.
 * 
 * The main method is called. It then calls the static method doMath(num1, num2)
 */

// Note - class name MUST be same as file name
public class DoSomeMath {

	public static void main(String[] args) {
		int num1 = 24;
		int num2 = 48;	
		
		// Call static method in same class
		doMath(num1, num2);
	}    // Closing brace to method
	
	/**
	 *  static method to do some basic math
	 *  It does basic integer addition, subtraction, multiplication, and division  and prints the result
	 * @param num1
	 * @param num2
	 * @return  - void
	 */
	
	public static void doMath(int num1, int num2) {
		int num3 = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + num3);
			
		num3 = num2 - num1;
		System.out.println("Difference of  " + num2 + " - " + num1 + " is " + num3);
		
		num3 = num2 * num1;
		System.out.println("Product of  " + num2 + " and " + num1 + " is " + num3);
		
		num3 = num2 / num1;
		System.out.println("Quotient  of  " + num2 + " / " + num1 + " is " + num3);
	} // Closing brace to method
} // Closing brace to class
