package suncoastChapter6Textbook;


//Listing 6.3

import java.util.Scanner;
// Demonstrates the relationship between arrays and strings
// Counts number of occurrences of each character in a String
public class LetterCount {
	public static void main(String[] args) {
		final int NUMCHARS = 26;
		Scanner scan = new Scanner(System.in);

		int[] upper = new int[NUMCHARS];
		int[] lower = new int[NUMCHARS];

		char current;
		int other = 0;

		System.out.println("Enter a sentence: ");

		String line = scan.nextLine();
		// Count occurrences of each character in String
		for(int ch = 0; ch < line.length(); ch++) {
			current = line.charAt(ch);
			if (current >= 'A' && current <= 'Z') {
				upper[current - 'A']++;
			} else if (current >= 'a' && current <= 'z') {
				lower[current - 'a']++;
			} else {
				other++;
			}
		}
		// Print the results
		System.out.println();
		for(int letter = 0; letter < upper.length; letter++) {
			System.out.print((char) (letter + 'A') + ": " + upper[letter]);
			System.out.print("\t\t " + (char)(letter + 'a') + ": " + lower[letter]);
			System.out.println();
	
		}
	}

}
