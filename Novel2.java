package suncoastCh7;


/**
 * Demonstrate classes and derived classes
 * This is a derived class
 * @author Jan
 *
 */
public class Novel2 extends Book2{

	private String type = "Fiction";
	
	public Novel2() {
		this("Fiction", 1500);
	}
	public Novel2(String type, int pages) {
		super(pages);
		this.type = type;
	}
	
	public void typeMessage() {
		System.out.println("Type of novel = " + type );
	}
	
	public String toString() {
		String str = "This is a novel of type " + type;
		str += ". " + super.toString();
		return str;
	}
	
	/**
	 * Main program to demonstrate derived classes and inheritance
	 * @param args
	 */
	public static void main(String[] args) {
		Novel2 nvl = new Novel2("Non-fiction", 300);
		
		// Access an inherited method
		nvl.pageMessage();
		
		// Access its own method
		nvl.typeMessage();
		
		System.out.println(nvl);
	}
}
