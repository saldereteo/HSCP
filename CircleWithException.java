package suncoastCh5Practice;

public class CircleWithException implements GeometricObjectInterface, Comparable<CircleWithException>{
	private double radius = 1;
	private String color = "red";
	private static int count = 0;

	/**
	 * No-arg constructor.
	 * Radius should be set to 1
	 * Color should be set to red
	 * Increment count
	 */
	CircleWithException() {
		count++;
	}
	
	/**
	 * Should set 
	 * this.radius = radius
	 * this.color = color
	 * Increment count
	 * @param radius
	 * @param color
	 * @throws Exception when radius <= 0
	 */
	CircleWithException(double radius, String color) throws Exception{
		if (radius <= 0) {
			throw new Exception("Invald radius " + radius);
		}
		this.radius = radius;
		this.color = color;
		count++;
	}
	
	/**
	 * Should set
	 * this.radius = radius
	 * @param r
	 * @throws Exception if radius <= 0
	 */
	void setRadius(double r) throws Exception {
		if (radius <= 0) {
			throw new Exception("Invald radius " + radius);
		}
		radius = r;
	}
	/**
	 * Gets the radius
	 * @return
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Should set this.color = color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Gets the color
	 */
	public String getColor() {
		return color;
	}
	
	/** Calculates and returns the area
	 * Area = PI * radius * radius
	 */
	public double getArea() {
		return Math.PI * Math.pow(radius,  2);
	}
	
	/**
	 * Calculates and returns perimeter
	 * Perimeter = 2 * PI * radius
	 */
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	
	/**
	 * Returns the current count
	 * @return
	 */
	static public int getCount() {
		return count;
	}
	
	/**
	 * Checks of this circle equals the circlec1 passed in.
	 * Compares radius and color
	 * @param c1
	 * @return
	 */
	public boolean equals(CircleWithException c1) {
		if (this.radius == c1.radius && this.color.equals(c1.color)) {
			return true;
		}
		return false;
	}
	
	/**
	 *  Returns a copy of current circle
	 * @return
	 * @throws Exception
	 */
	public CircleWithException copy() throws Exception{
		return new CircleWithException(this.radius, this.color);
	}
	
	/** Compares  area of this circle with the circle passed in.
	 * Returns
	 * 1 if this circle > circle passed in
	 * 0 if the areas are equal
	 * -1 if this circle < circle passed in
	 * 
	 */
	public int compareTo(CircleWithException c1) {
		if (this.getArea() > c1.getArea()) {
			return 1;
		} else if (this.getArea() < c1.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

}