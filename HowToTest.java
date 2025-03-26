package semExamPractice;

public class HowToTest {
	
	
	// How many test cases are needed to test all possible return values of this method?
	// Specify a minimal set of test values that you can use to test all the return values.
	public int howToTest(int x) {
		
		int j = 0;
		if (x  % 5 == 0) {
			j = 1;
		} else if (x > 13) {
			j = 2;
		} else if (x >= 0) {
			j = 3;
		} else {
			j = 4;
		}
		return j;
	}
	

	public static void main(String[] args) {
		
	}

}