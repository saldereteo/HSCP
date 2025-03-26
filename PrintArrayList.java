package ArrayListPatterns;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Shows different ways to print an ArrayList
 * @author 1116444
 *
 */
public class PrintArrayList {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();

		// Add 5entries to the ArrayList
		for (int i = 0; i < 5; i++) {
			alist.add("abcd" + i);
		}

		System.out.println("Shortcut way to print ArrayList");
		System.out.println(alist);
		System.out.println("PrintArrayList with for loop");
		// Print out the arrayList using a for loop
		for (int i = 0; i < alist.size(); i++) {
			String str1 = alist.get(i);
			System.out.println(str1);
		}

		System.out.println("Print ArrayList with foreach loop");
		// Print out the arrayList using a for loop
		for (String str1 : alist) {
			System.out.println(str1);
		}

		System.out.println("Print ArrayList with iterator");
		// Print out the arrayList using a for loop
		ListIterator<String> iter = alist.listIterator();
		while (iter.hasNext()) {
			String str1 = iter.next();
			System.out.println(str1);
		}
	}
}
