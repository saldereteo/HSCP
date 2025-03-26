package suncoastChapter5;


public class TestReturnObject {
	
	public static void main(String[] args) {		
		CircleWithPrivateDataFields c = createCircle(5);	
		printCircle(c);
		
	}
	
	public static CircleWithPrivateDataFields createCircle(int radius) {
		// Create the Array of circle references
		// Each circle reference will initially have a null value
		CircleWithPrivateDataFields circle = new CircleWithPrivateDataFields(radius);
		return circle;
	}
	
	public static void printCircle(CircleWithPrivateDataFields circle) {
			System.out.println(circle);
	}
}

