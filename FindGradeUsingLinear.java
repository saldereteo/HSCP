package suncoastChapter6Textbook;

public class FindGradeUsingLinear {

	public static void main(String[] args) {

		// The array need not be sorted
		int[] grades = { 60, 58, 72, 77, 78, 85, 86, 89, 93, 95 };

		// Search for grade 77
		int lookFor = 77;
		int pos = Searches.linearSearch(grades, lookFor);
		if (pos != -1) {
			System.out.println("The grade " + lookFor + " was found in position " + pos);
		} else {
			System.out.println("The grade " + lookFor + " was not found");
		}

		// Search for grade 94
		lookFor = 94;
		pos = Searches.linearSearch(grades, lookFor);
		if (pos != -1) {
			System.out.println("The grade " + lookFor + " was found in position " + pos);
		} else {
			System.out.println("The grade " + lookFor + " was not found");
		}
	}

}
