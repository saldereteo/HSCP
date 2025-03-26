package suncoastChapter3;

public class BooleanDemo {
	
	public static void main(String[] args) {
		
		boolean bVal = true;
		System.out.println("Printing boolean variable value bVal. Should be true = " + bVal);
		

		System.out.println("Testing relational operators");
		System.out.println("boolean value 4 < 6  " + (4 < 6));
		
		System.out.println("boolean Value 10 <= 9 " + (10 <= 9));
		
		System.out.println("boolean value a == b " + ('a' == 'b'));
		
		System.out.println("Boolean value 1 != 2 " + (1 != 2));

		int a1 = 1;
		int a2 = 2;
		System.out.println("Precedence  demo - arithemetic has higher precedence than boolean  " + (3 == a1 + a2));
		
		// Precedence
		// relational operator > assignment operator
		boolean z = a1 == a2;
		System.out.println(z);	
	
		//Precedence
		// arithmetic operator > relational operator > assignment operator.
		int x = 3;
		z =  x % 2 == 0; 
		System.out.println(z);
	
	}

}
