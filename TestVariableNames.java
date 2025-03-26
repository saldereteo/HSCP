package suncoastChapter5;

public class TestVariableNames {
	
	String name1;
	String name2;
	int k = 12;
	
	public TestVariableNames(String name1, String name2) {
		int x = 6; // x is local. Scope is the method
		// Use same variable name for method parameter and instance variables.
		// this reference indicates the instance variable 
		this.name1 = name1;
		this.name2 = name2;

		// Use the same local variables in different non-nested loops
		System.out.println("Printing the local variable k");
		for(int i = 0; i < 5; i++) {
			int k = i; // local variable k hides instance variable
			System.out.println(k);
		}
		
		System.out.println("Printing the instance variable k");
		for(int i = 0; i < 5; i++) {
			k += i; // instance variable k
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		TestVariableNames tv = new TestVariableNames("name1", "name2");
	}
	


}
