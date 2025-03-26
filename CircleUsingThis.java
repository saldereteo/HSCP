package suncoastChapter5;

import suncoastCh5Practice.OldCircle;

public class CircleUsingThis {

	// the radius of the circle
	double radius = 1;
	public static void main(String[] args) {
		
		// Create circle with default constructor (radius = 1)
		CircleUsingThis circle1 = new CircleUsingThis();
		System.out.println("The circle has radius = " + circle1.radius + " and area " + circle1.getArea());
		
		// Create circle with default constructor (radius = 1)
		CircleUsingThis circle2 = new CircleUsingThis(25);
		System.out.println("The circle has radius = " + circle2.radius + " and area " + circle2.getArea());
		
		//Set new radius for circle2
		circle2.setRadius(16);
		System.out.println("The circle has radius = " + circle2.radius + " and area " + circle2.getArea());
		
		// anonymous object
		System.out.println("This is an anonymout Simple Circle with area = " + new OldCircle(5).getArea());
	}

	// Default constructor for circle.
	// the circle created will have radius 1
	CircleUsingThis() {
		this(1.0);	
	}
	
	// Constructor containing radius
	CircleUsingThis(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	double getPerimeter() {
		this.setRadius(3);
		return 2 * this.radius * Math.PI;
	}
	
	void setRadius( double radius) {
		this.radius = radius;
	}

}