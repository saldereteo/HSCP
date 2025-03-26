package suncoastChapter3;

import java.util.Scanner;

public class ifErrorsDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Missing braces error:");
		System.out.println("Test the number 5");
		
		int x = 5;
		boolean numberIsEven = false;
		
		if (x % 2 == 0)
			numberIsEven = true;

		System.out.println(x + " is even");
		
		System.out.println("Missplaced semicolon");
		
		if (x % 2 == 0);
		{
			System.out.println(x + " is even");
		}
		
		
		System.out.println("redundant boolean check");
		boolean b = true;
		if (b == true) { // us if(b)
			System.out.println(" b is true");
		}
		
		System.out.println("Ambiguous else problem");
		int i = 6;
		int j = 3;
		int k = 4;
		// Ambiguous else. What if does the else really apply to
		// Use braces to correct
		if (i > j)
			
			if (j > k)
				System.out.println("i > j > k");
		else
			System.out.println("j >= i");
		
		
		//Avoiding duplicate code. No need for multiply Congratulations
		if (x % 2 == 0)
		{
			System.out.println(x + " is even");
			System.out.println("Congratulations");
		} else {

			System.out.println(x + " is odd");
			System.out.println("Congratulations");
		}
	}
	
}
