package suncoastChapter3;

import java.util.Scanner;
public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		// Is it a leap year
		boolean isLeapYear = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
		
		// How could I write this with if else
		
		System.out.println(year + "is a leap year? " + isLeapYear);
	}

}
