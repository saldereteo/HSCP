package suncoastCh7;

public class NovelNoInheritance {

	private String type = "Fiction";
	private int pages = 300;
	
	public NovelNoInheritance() {
		
	}
	public NovelNoInheritance(String type, int pages) {
		this.type = type;
		this.pages = pages;
	}
	
	public void typeMessage() {
		System.out.println("Type of novel = " + type );
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
	
	public String toString() {
		String str = "This is a novel of type " + type;
		str += ". It has " + pages + " pages";
		return str;
	}
	/**
	 * Main program to demonstrate derived classes and inheritance
	 * @param args
	 */
	public static void main(String[] args) {
		NovelNoInheritance nvl = new NovelNoInheritance("Non-fiction", 300);
		
		// Access an inherited method
		nvl.pageMessage();
		
		// Access its own method
		nvl.typeMessage();
		
		System.out.println(nvl);
	}
}
