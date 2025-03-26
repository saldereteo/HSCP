package suncoastCh7;
/**
 * Parent class. Demonstrates the use of inheritance
 * @author Jan
 *
 */
public class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	
	public GeometricObject(){
		
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setFilled(boolean filled) {
		this.color = color;
	}
	
	public boolean getFilled() {
		return filled;
	}
	
	private boolean isItFilled() {
		return filled;
	}
	
	// Overriding of Object's toString
	public String toString() {
		String str = "color = " + color + " and filled = " + filled;
		return str;
	}
}
