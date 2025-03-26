package suncoastCh5Practice;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * This is a demo of the Iterator interface.
 * 
 * Creates a list and add elements to it
 * 
 * Then steps through the list and prints out each entry.
 * For each step, the code will
 * 1. check if there are more entries
 * 2. If there are more entries, then it gets the next entry.                
 */
public class IteratorDemo {
	

	
	public static void main(String[] args) {
		// create a list
		ArrayList<String> al = new ArrayList();
		al.add("String1");
		al.add("String2");
		al.add("String3");
		al.add("String4");
		al.add("String5");
		
		// iterator() returns an object that complies with the Iterator interface
		Iterator iter = al.iterator();
		
		// Check if the list has more entries
		boolean b = true;
		System.out.println("First time");
		while(iter.hasNext()) {
			
			// Get the next entry in the list
			String str = (String) iter.next();
			System.out.println(str);
			if (b) {
				iter.remove();
				b = false;
			} 
		}
		
		System.out.println("And again");
		iter = al.iterator();
		
		while(iter.hasNext()) {
			
			// Get the next entry in the list
			String str = (String) iter.next();
				System.out.println(str);
		}
		
	}
}
