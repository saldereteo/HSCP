package suncoastChapter4;

public class Circle {
	// the radius of the circle
	private double radius = 1;
	private String color = "red";
	
	// Default constructor for circle.
	// the circle created will have radius 1
	public Circle() {
		
	}
	
	// Constructor containing radius
	public Circle(double newRadius, String newColor) {
		radius = newRadius;
		color = newColor;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getCircumference() {
		return  getPerimeter();
	}
	
	public void setRadius( double newRadius) {
		radius = newRadius;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String newColor) {
		color  = newColor;
	}
	public void printInfo() {
		System.out.println("Radius = " + radius + " color = "
	          + color +  " area = " + getArea() + " perimeter = " + getPerimeter());
	}
	
	public Circle  getIncrementedCircle() {
		
		double newRadius = radius + 1;
		Circle circle = new Circle(newRadius, color);
		return circle;		
	}	
	
	public static void main(String[] args) {
		System.out.println("Im here");
		Circle circle1 = new Circle();
		circle1.printInfo();

		Circle circle2 = new Circle(4, "green");
		circle2.printInfo();

		circle2.setRadius(7);
		circle2.printInfo();
		Circle circle3 = circle2.getIncrementedCircle();

		circle3.printInfo();
	}
}
