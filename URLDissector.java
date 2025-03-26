package suncoastChapter3;

//***********************************
// URLDissector.java
// Demonstrates the use of  Scanner to read a file

import java.util.Scanner;
import java.io.*;

public class URLDissector
{
	//Reads urls from a file and prints path components

	public static void main(String[] args) throws IOException
	{
		String url;
		Scanner fileScan, urlScan;
		fileScan = new Scanner(new File("e:\\urls.inp"));
		while(fileScan.hasNext()) {
			url = fileScan.nextLine();
			System.out.println("url: " + url);
			urlScan = new Scanner(url);
			urlScan.useDelimiter("/");
			while(urlScan.hasNext()) {
				System.out.println("   " + urlScan.next());
				System.out.println();
			}
		}
	}
}