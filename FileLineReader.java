package suncoastChapter3;
//***********************************
// FileLineReader.java
// Demonstrates the use of  Scanner to read a file

import java.util.Scanner;
import java.io.*;

public class FileLineReader
{
	//Reads lines from a file

	public static void main(String[] args) throws IOException
	{
		String line;
		Scanner fileScan;
		//For relative paths, start at eclipse project directory
		// Use single forward slash as separator
		fileScan = new Scanner(new File("bin/dummyfile.txt"));
		
		// For absolute paths, specify drive first.
		// Use single forward slash as separator
		//fileScan = new Scanner(new File("e:/dummyfile.txt"));
		while(fileScan.hasNext()) {
			line = fileScan.nextLine();
			System.out.println(line);

		}
	}
}