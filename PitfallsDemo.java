package suncoastChapter3;

public class PitfallsDemo {


	public static void main(String[] args) {
		// Unnecessary use of if
		boolean bVar;
		int number = 2;
		if (number % 2 == 0) {
			bVar = true;
		} else {
			bVar = false;
		}
		// better way
		// bVar = number % 2 == 0
		
		// Duplicate code in both branches
		int tuition;
		boolean instate = true;
		
		if (instate) {
			tuition = 2000;
			System.out.println("Tuition is " + tuition);
		} else {
			tuition = 5000;
			System.out.println("Tuition is " + tuition);
		}		
	}
}
