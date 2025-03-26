package suncoastCh7;
/**
 * Parent class. Demonstrates inheritance and the use of the super reference
 * @author Jan
 *
 */
public class Book2 {
	//Instance variables are now private
	private int pages = 33;
	

	public Book2() {

	}


	public Book2(int numPages) {
		pages = numPages;
	}


	public String toString() {
		return "The book has " + pages + " pages";
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
	public void setPages(int p) {
		pages = p;
	}
	private String  getCoverColor() {
		return "blue";
	}
}
