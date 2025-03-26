package suncoastCh7;

/**
 * Demonstrate classes and derived classes
 * This is a derived class
 * @author Jan
 *
 */
public class Dictionary extends Book{

	private int definitions = 52500;

	static int x() {
		return 3;
	}

	public Dictionary() {
		
	}
	public Dictionary(int definitions, int pages) {
		this.definitions = definitions;
		this.setPages(pages);
	}
	
	public void definitionMessage() {
		System.out.println("Number of definitions = " + definitions);
		System.out.println("Definitions per page = " + definitions/this.getPages());
	}
	
	
	/**
	 * Main program to demonstrate derived classes and inheritance
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dictionary d = new Dictionary();
		d.definitionMessage();
		d.pageMessage();

		

	}

}
