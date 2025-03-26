package ArrayListPatterns;

import java.util.ArrayList;

/**
 * Demonstrate the vasrious methods within the ArrayList class
 * @author 1116444
 *
 */
public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<>();
		
		// Add 5entries to the ArrayList
		for(int i = 0; i < 5; i++) 
		{
			alist.add("abcd" + i);
		}
		
		// Get the entry at position 0
		
		String str = alist.get(0);
		
		//Insert an entry into position 0
		alist.add(0, "efgh");
		
		// Print out the arrayList using a for loop
		for(int i = 0; i < alist.size(); i++) {
			String str1 = alist.get(i);
			System.out.println(str1);
		}
		
		// Remove an entry from the ArrayList. Value removed is returned
		
		String remVal = alist.remove(0);
		System.out.println("Value removed = " + remVal);
		System.out.println("New List");
		for(int i = 0; i < alist.size(); i++) {
			String str1 = alist.get(i);
			System.out.println(str1);
		}
	}
}
