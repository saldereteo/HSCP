package semExamPractice;

/**
 * Demonstrates how a class can use constructors
 * to build objects that it aggregates
 * The Person class contains both a Name and an address
 * One constructor takes a Name and Address object as input
 * The other constructor takes the components of the Name and Address objects and builds them
 * @author 1116444
 *
 */
public class Person {
	
	
	private Name name;
	private Address address;
	int age;
	
	// This constructor uses the Name and Address objects provided
	
	public Person(Name name, Address address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	//This constructor takes the components of the name and address objects and constructors each of them
	
	public Person(String first, String last, String street, String city, String state, String zip, int age) {
		name = new Name(first, last);
		address = new Address(street, city, state, zip);
		this.age = age;
	}

}


