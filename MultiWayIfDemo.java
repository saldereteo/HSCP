package suncoastChapter3;
import java.util.Scanner;
public class MultiWayIfDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your numeric grade: ");
		char letterGrade;
		int numericGrade = input.nextInt();
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
		System.out.println("Letter Grade = " + letterGrade);

	}

}
