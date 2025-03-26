package suncoastCh7;

public class DictionaryNoInheritance {
	private int definitions = 52500;
	private int pages = 1500;
	
	public DictionaryNoInheritance() {
		
	}
	public DictionaryNoInheritance(int definitions, int pages) {
		this.definitions = definitions;
		this.pages = pages;
	}
	
	public void definitionsMessage() {
		System.out.println("Number of definitions = " );
		System.out.println("Definitions per page = " + definitions/pages);
	}
	
	public String toString() {
		String str = "This is a dictionary with " + definitions + " definitions.";
		str += " It has " + pages + " pages";
		return str;
	}
	
	/*
	 * Prints a message about pages in a book.
	 */
	public void pageMessage() {
		System.out.println("Number of pages = " + pages);
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
	/**
	 * Main program to demonstrate derived classes and inheritance
	 * @param args
	 */
	public static void main(String[] args) {
		DictionaryNoInheritance webster = new DictionaryNoInheritance();
		
		// Access an inherited method
		webster.pageMessage();
		
		// Access its own method
		webster.definitionsMessage();
		
		System.out.println(webster);
	}
}
