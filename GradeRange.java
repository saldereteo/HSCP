package suncoastChapter6Textbook;


//Listing 6.5
// Demonstrates the use of an array of String objects
public class GradeRange {

	public static void main(String[] args) {
		String[] grades = {"A", "B", "C", "D", "F"};
		int[] cutoff = {90, 80, 70, 60, 0};
		for(int level = 0; level < grades.length; level++) {
			System.out.println(grades[level] + "\t" + cutoff[level]);
			
		}
	}

}
