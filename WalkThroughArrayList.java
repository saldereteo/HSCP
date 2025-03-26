package ArrayListPatterns;

import java.util.ArrayList;
import java.util.ListIterator;
/** 
 * Demonstrates walking through ArrayList with different types of loops
 * @author 1116444
 *
 */
public class WalkThroughArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<>();
		
		// Add 5entries to the ArrayList
		for(int i = 0; i < 5; i++) 
		{
			alist.add("abcd" + i);
		}
		
		System.out.println("Walk through ArrayList with for loop");
		// Print out the arrayList using a for loop
		for(int i = 0; i < alist.size(); i++) {
			String str1 = alist.get(i);
			System.out.println(str1);
		}
		
		System.out.println("Walk through ArrayList with foreach loop");
		// Print out the arrayList using a for loop
		for(String str1: alist) {
			System.out.println(str1);
		}
		
		
		System.out.println("Walk through ArrayList with iterator");
		// Print out the arrayList using a for loop
		ListIterator<String> iter = alist.listIterator();
		while(iter.hasNext()) {
			String str1 = iter.next();
			System.out.println(str1);
		}
	}
}
