package suncoastChapter2;

public class ErrorsDemo {

	public static void main(String[] args) {
		
		// Uninitialized variable
		int x;
		//int y = x; 		// Uninitialized variable
		int www;
		//y = w; // Undeclared variable
		
		int z; // Unused variable
		
		
		// Integer overflow;
		int testOverflow = 0x7FFFFFFF;
		System.out.println("test overflow - original value = " + testOverflow);
		testOverflow += 10000;
		System.out.println("test overflow - added more to it = " + testOverflow);
		// Integer division
		int a = 10;
		int b = 4;
		double c = 10 / 4;  // truncation
		System.out.println("10 / 4 with integer divison = " + c);
		
		c = ((float) 10) / 4;
		System.out.println("10 / 4 with floating point divison = " + c);
		
		
		

	}
}
