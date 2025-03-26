package suncoastChapter2;


public class FormattingDemo {

	public static void main(String[] args) {
		
		double x = 45.879;
		System.out.printf("%6d#%12s$%8.2f\n",  1234, "Javaaaaaa", x);
		System.out.println("Same stuff left justified");
		System.out.printf("%-6d#%-12s$%-8.2f\n",  1234, "Java", 51.635789);
		System.out.printf("%70s\n", "String formatting. Display more spaces than needed");
		System.out.printf("Display more characters than specified (2 digits, 5 characters)  = %2d,%5s", 1234, "string longer than 5");
	}
}