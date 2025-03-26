package suncoastChapter3;



public class Counter2
{
	public static void main(String[] args)
	{
		final int LIMIT = 5;
		for(int count = 1; count <= LIMIT; count++){
			System.out.println(count);
			count++; // Use of increment operator.
		}
		System.out.println("Done");
	}
}