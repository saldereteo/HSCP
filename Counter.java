package suncoastChapter3;


public class Counter
{
	public static void main(String[] args)
	{
		final int LIMIT = 5;
		int count = 1;
		while(count <= LIMIT) {
			System.out.println(count);
			count++; // Use of increment operator.
		}
		System.out.println("Done");
	}
}
