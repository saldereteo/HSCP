package suncoastChapter3;

//***********************************
//NumberFileReader.java
//Demonstrates the use of  Scanner to read a file

import java.util.Scanner;
import java.io.*;

public class NumberFileReader
{
	//Reads lines from a file

	public static void main(String[] args) throws IOException
	{
		String line;
		Scanner fileScan;
		//For relative paths, start at eclipse project directory
		// Use single forward slash as separator
		fileScan = new Scanner(new File("bin/numbers.txt"));
		
		while(fileScan.hasNextInt()) {
			int x = fileScan.nextInt();
			//line = fileScan.nextLine();
			System.out.println(x);

		}
	}
}