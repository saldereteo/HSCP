package suncoastChapter6Textbook;

//Listing 6.10

import java.util.Scanner;

// Demonstrates a linear search
public class Guests {

	// Create an array of guest names and allow the user to search for one
	public static void main(String[] args) {
		
		String[] guests = {"Mary", " Joan", "Bob", "Sarah"};
		String name;
		boolean found = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name: ");
		name = scan.nextLine();
		for(int i = 0; i < guests.length; i++) {
			if (name.equals(guests[i])) {
				found = true;
			}
		}
		if (found) {
			System.out.println(name + " is on the guest list");
		} else {
			System.out.println(name  + " is not on the guest list");;
		}
		
	}
}
