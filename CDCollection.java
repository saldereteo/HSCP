package suncoastChapter6Textbook;

//Listing 6.8

import java.text.NumberFormat;

// Represents a collection of CDs
public class CDCollection {

	private CD[] collection;
	private int count;
	private double totalCost;
	
	// Create the collection
	public CDCollection() {
		collection = new CD[100];
		count = 0;
		totalCost = 0.0;
	}
	// Creates a CD object and adds it to the array
	public void addCD(String title, String artist, double cost, int tracks) {
		// Increase the size of the array, if needed
		if (count == collection.length) {
			increaseSize();
		}
		collection[count] = new CD(title, artist, cost, tracks);
		totalCost += cost;
		count++;
	}
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String report = "*************************************************\n";
		report += "My cd collection\n\n";
		report += "Number of CDs: " + count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "\nCD List:\n";
		// Add each CD to the String
		for(int cd  = 0; cd < count; cd++) {
			report += collection[cd].toString() + "\n";
		}
		return report;
		
	}
	// Increases the size of the collection array
	private void increaseSize() {
		// Create a new array. Make it twice as large as the current array
		CD[] temp = new CD[collection.length * 2];
		
		// Copy the old array into the new
		for(int cd = 0; cd < collection.length; cd++) {
			temp[cd] = collection[cd];
		}
		// Now set collection = the new array
		collection = temp;
	}
}
