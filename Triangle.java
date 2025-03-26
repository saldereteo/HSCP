package suncoastCh5Practice;

import java.util.Arrays;

public class Triangle  implements GeometricObjectInterface, Comparable<Triangle> {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	private String color = "white";
	private boolean fill = false;

	
	public Triangle()
	{
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean fill) throws Exception {
		this.color = color;

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.fill = fill;
	}
	
	
	public Triangle(Triangle t1) throws Exception{
		this.side1 = t1.side1;
		this.side2 = t1.side2;
		this.side3 = t1.side3;
		this.color = t1.color;
		this.fill = t1.fill;
		
	}
	
	public int compareTo(Triangle t1) {
		
		if (this.getArea() > t1.getArea() ) {
			return 1;
		} else if (this.getArea() < t1.getArea() ) {
			return -1;
		} 
		return 0;
		
	}
	
	public void setSide1(double value) throws Exception {
		side1 = value;
	}
	
	public void setSide2(double value) throws Exception {
		side2 = value;

	}
	
	public void setSide3(double value) throws Exception{
		side3 = value;

	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setFill( boolean fill) {
		this.fill = fill;
	}
	
	public boolean getFill() {
		return this.fill;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public double getArea() {
		double sumSides = (side1 + side2 + side3) / 2;
		double area = Math.pow(sumSides * (sumSides - side1) * (sumSides - side2) * (sumSides - side3), .5);
		return area;
	}
	
	public void printInfo() {
		System.out.println(this);
	}
	
	public String toString() {
		String s = "Triangle: Size 1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", perimeter = " + getPerimeter() + ", area = " + getArea();
		s = s + "\n" +"Color = " + color;
		return s;
	}
	
	
	public boolean equals(Triangle t1) {
		if (this.side1 == t1.side1 && this.side2 == t1.side2 && this.side3 == t1.side3 && this.color.equals(t1.color)) {
			return true;
		}
		return false;
	}

}
