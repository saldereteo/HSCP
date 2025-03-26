package suncoastCh7;


/**
 * Demonstrate classes and derived classes
 * This is a derived class
 * @author Jan
 *
 */
public class Novel extends Book{

	private String type = "Fiction";
	
	public Novel() {
		
	}
	public Novel(String type, int pages) {
		this.type = type;
		this.setPages(pages);
	}
	
	public void typeMessage() {
		System.out.println("Type of novel = " + type );
	}
	
	public String toString() {
		String str = "This is a novel of type " + type;
		str += ". It has " + this.getPages() + " pages";
		return str;
	}
	/**
	 * Main program to demonstrate derived classes and inheritance
	 * @param args
	 */
	public static void main(String[] args) {
		Novel nvl = new Novel("Non-fiction", 300);
		
		// Access an inherited method
		nvl.pageMessage();
		
		// Access its own method
		nvl.typeMessage();
		
		System.out.println(nvl);
	}
}
