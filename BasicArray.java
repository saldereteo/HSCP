package suncoastChapter6Textbook;

//Listin g 6.1
public class BasicArray {
	final static int LIMIT = 15;
	final static int MULTIPLE = 10;
	
	// Creates an array and fills it with nteger values.
	//Modifies one value and prints it out
	public static void main(String[] args) {
		int[] list = new int[LIMIT];
		
		for(int index = 0; index < list.length; index++) {
			list[index] = index * MULTIPLE;
		}
		list[5] = 999;
		
		for(int index = 0; index < list.length; index++) {
			System.out.print(list[index] + " ");
		}
		
		System.out.println();
		
	}
}
