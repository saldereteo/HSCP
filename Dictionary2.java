package suncoastCh7;


/**
 * Demonstrate classes and derived classes and the super reference
 * This is a derived class
 * @author Jan
 *
 */

import java.util.Scanner;

public class Dictionary2 extends Book2{

	private int definitions = 52500;
	
	public Dictionary2() {
	
	}
	
	public Dictionary2(int numPages, int definitions) {
		super(numPages);
		this.definitions = definitions;

	}
	public void definitionsMessage() {
		System.out.println("Number of definitions = " + definitions );
		System.out.println("Definitions per page = " + definitions/getPages());
	}
	
	// Uses super to get toString() of parent
	public String toString() {
		String str = "This is a dictionary with " + definitions + " definitions.";
		str += super.toString();
		return str;
	}
	
	/**
	 * Main program to demonstrate derived classes and inheritance
	 * @param args
	 */
	public static void main(String[] args) {
		Dictionary2 webster = new Dictionary2(1680, 66543);
		
		Dictionary2 funkandWagonal = new Dictionary2(500, 32000);
		
		// Access an inherited method
		webster.pageMessage();
		
		Scanner input = new Scanner(System.in);
		
		// Access its own method
		webster.definitionsMessage();
		
		System.out.println(webster);
		
		System.out.println("Other dictionary");
		
		funkandWagonal.pageMessage();
		
		// Access its own method
		funkandWagonal.definitionsMessage();
		
		System.out.println(funkandWagonal);
		
		Dictionary2 bob = new Dictionary2();
		bob.definitionsMessage();
	}
}
