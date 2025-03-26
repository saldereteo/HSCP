package suncoastChapter6Textbook;

//Listing 6.12

// Use this to test binary search
public class FindGrade {

	public static void main(String[] args) {
		
		int[] grades = { 60, 68, 72, 73, 77, 78, 85, 86, 89, 93, 95};

		// Search for grade 77
		int lookFor = 77;
		int pos = Searches.binarySearch(grades,  lookFor);
		if (pos != -1) {
			System.out.println("The grade " + lookFor + " was found in position " + pos);
		} else {
			System.out.println("The grade " + lookFor + " was not found");
		}
		
		
		// Search for grade 94
		lookFor = 94;
		pos = Searches.binarySearch(grades,  lookFor);
		if (pos != -1) {
			System.out.println("The grade " + lookFor + " was found in position " + pos);
		} else {
			System.out.println("The grade " + lookFor + " was not found");
		}
	}
}
