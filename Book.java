package suncoastCh7;

/**
 * Demonstration of classes and derived classes
 * This is the parent class
 * @author Jan
 *
 */
public  class Book  {

	private int pages = 1500;
	

	public Book() {
	}
	
	public Book(int pages)
	{
		this.pages = pages;
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

	
}
