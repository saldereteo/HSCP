package suncoastChapter4;

import java.util.Scanner;

public class PrintGradeAndGetGrade {
	
	public static void main(String[] args) {
		System.out.println("This program defines a void method to print a grade and a similar method to return a grade");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a numeric grade: " );
		int numericGrade = input.nextInt();
		printGrade(numericGrade);
		char grade = getGrade(numericGrade);
		System.out.println("Letter grade from getGrade = " + getGrade(numericGrade));
		
	}
	
	public static void printGrade(int numericGrade) {

		char letterGrade;

		if (numericGrade <= 0 || numericGrade > 100) {
			System.out.println("Invalid score" + numericGrade);
			return;
		}
		
		if (numericGrade >= 90) {
			letterGrade = 'A';
		} else if (numericGrade >= 80) {
			letterGrade = 'B';
		} else if (numericGrade >= 70) {
			letterGrade = 'C';
		} else if (numericGrade >= 60) {
			letterGrade = 'D';
		} else {
			letterGrade = 'F';
		}

		System.out.println("Letter grade from printGrade = " + letterGrade);
		//System.out.println("Letter grade = " + getGrade(numericGrade));
	}
	public static char getGrade(int numericGrade) {

		char letterGrade = ' ';
		if (numericGrade >= 90) {
			letterGrade = 'A';
		} else if (numericGrade >= 80) {
			letterGrade = 'B';
		} else if (numericGrade >= 70) {
			letterGrade = 'C';
		} else if (numericGrade >= 60) {
			letterGrade = 'D';
		} else {
			letterGrade = 'F';
		}
		return letterGrade;
	}

}
