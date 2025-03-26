package suncoastChapter3;

import java.util.Scanner;
import java.util.Random;

import javax.swing.JOptionPane;

public class AdditionQuiz {

	public static void main(String[] args) {
		final String YES = "Y";
		Scanner input = new Scanner(System.in);
		// Math.random() generates a random number between 0 and 1.
		// We want it between 0 and 100, so we multiply by 100 and truncate the
		// decimal

		String yesOrNo = "Y";

		final int MAX_GUESSES = 3;

		while (yesOrNo.equalsIgnoreCase(YES)) {
			int number1 = (int) (Math.random() * 100);
			int answer = 0;
			int number2 = (int) (Math.random() * 100);
			int realAnswer = 0;
			// Build my question string
			boolean correct = false;
			for (int i = 0; i < MAX_GUESSES && correct == false; i++) {
				String displayStr = "What is " + number1 + " + " + number2 + "? ";
				System.out.println(displayStr);
				answer = input.nextInt();

				// Determine the correct result
				realAnswer = number1 + number2;
				String strOut = "";
				// Indicate the correctness of the user guess using the
				// relational operator
				correct = realAnswer == answer;
				if (!correct && i < MAX_GUESSES - 1) {
					System.out.println("Not quite. Try again");
				}
			}
			if (correct) {
				System.out.println("You got it!!!");
			} else {
				System.out.println("Sorry, the correct answer was " + realAnswer);
			}
			System.out.print("Would you like to play again (Y or N)? ");
			yesOrNo = input.next();
		}
		System.out.println("Have a great day at Suncoast");

	}

}
