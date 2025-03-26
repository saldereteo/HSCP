package ArrayListPatterns;

import java.util.ArrayList;

/**
 * How to find the max and min of an ArrayList
 * @author 1116444
 *
 */
public class MaxAndMinArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<>();
		// Add entries to the ArrayList
		for (int i = 0; i < 5; i++) {
			alist.add(i);
		}
		int max = alist.get(0);
		int min = alist.get(0);
		for (int i = 0; i < alist.size(); i++) {

			if (max < alist.get(i)) {
				max = alist.get(i);
			}

			if (min > alist.get(i)) {
				min = alist.get(i);
			}

		}

		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}
