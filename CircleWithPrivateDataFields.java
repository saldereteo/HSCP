package suncoastChapter4;


public class CircleWithPrivateDataFields {
	
	private static int numberOfObjects = 0;
	// the radius of the circle
	private double radius = 1;
	
	// Default constructor for circle.
	// the circle created will have radius 1
	public CircleWithPrivateDataFields() {
		numberOfObjects++;
		
	}
	
	// Constructor containing radius
	public CircleWithPrivateDataFields(double radius) {
		this.radius = radius;
		numberOfObjects++;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius( double newRadius) {
		radius = newRadius;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/**
	 * Placing this method with the Circle class provides a common method for displaying circle nfo.
	 */
	public  String  toString() {
		return "Circle has radius " + getRadius() + " and Perimeter " + getPerimeter() + " and area " + getArea();
	}
	
	
	public static void main(String[] args) {
		
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5);
		System.out.println("Radius of circle = " + myCircle.getRadius());
		
		// Can access private member from static method
		myCircle.radius = 7;
		System.out.println("New Radius of circle = " + myCircle.getRadius());	
		System.out.println("Number of Objects = " + myCircle.getNumberOfObjects());	
	}

	
}
