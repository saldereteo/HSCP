package suncoastChapter6;

/**
 * Demonstrates the need for arrays.
 * Average of 5 variables is computed.
 * @author Jan
 *
 */
public class NeedForArrays {

	public static void main(String[] args) {
		System.out.println("Take sum and mean of 5 numbers and display how many are above mean");

		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);
		int num3 = (int) (Math.random() * 100);
		int num4 = (int) (Math.random() * 100);
		int num5 = (int) (Math.random() * 100);
		int sum = num1 + num2 + num3 + num4 + num5;
		double mean = (double)(sum) / 5;
		int count = 0;
		if (num1 >= mean) {
			count++;
		}
		if (num2 >= mean) {
			count++;
		}
		if (num3 >= mean) {
			count++;
		}
		if (num4 >= mean) {
			count++;
		}
		if (num5 >= mean) {
			count++;
		}
		System.out.println("sum = " + sum + " mean = " + mean + " number over mean = " + count);
		
		System.out.println("Now do it with an array of 10000 entries");
		System.out.println("***??????????*********");
		
		
		int[] arr = new int[10000];
		
		double arrSum = 0;
		int arrCount = 0;
		for(int i = 0; i < arr.length; i++) {
			
			arr[i]  = (int) (Math.random() * 100);
			arrSum += arr[i];
		}
		double arrMean = arrSum /arr.length;
		for(int i = 0; i < arr.length; i++) {
			
			if (arr[i] >= arrMean)
				arrCount++;
		}
		
		System.out.println("Array sum = " + arrSum + " Array mean = " + arrMean + " number over mean = " + arrCount);
	}
}
