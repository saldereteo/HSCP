package suncoastChapter6Textbook;
//Listing 6.4

//Demonstrates use of an initializer list for an array
public class Primes {

	public static void main(String[] args) {
		int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};
		System.out.println("Array length: " + primeNums.length);
		System.out.println("the first " + primeNums.length + " primes are: ");
		for(int index = 0; index < primeNums.length; index++) {
			System.out.print(primeNums[index] + " ");
		}
		System.out.println();
	}
}
