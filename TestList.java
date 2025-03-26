package practiceP5;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;
// Demonstrates the use of the ListIterator Interface
public class TestList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("aaa");
		arr.add("bbb");
		ListIterator<String> it = arr.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
