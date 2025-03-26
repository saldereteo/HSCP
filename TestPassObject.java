package suncoastChapter5;


public class TestPassObject {
	
	public static void main(String[] args) {
		
		System.out.println("Before creating objects, number of circles = " + CircleWithStaticMembers.numberOfObjects);
		
		CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields();
		printCircle(c1);
		
		c1.setRadius(6);
		
		CircleWithPrivateDataFields c2 = new CircleWithPrivateDataFields(3);
		printCircle(c2);
		
		// print areas for radius 1 - 5
		int n = 5;
		printAreas(c2, n);
		// Note that n should be unchanged, but the contents of c2 should be changed
		System.out.println("Final circle radius = " + c2.getRadius());
		System.out.println("n = " + n);
		
	}
	
	public static void printCircle(CircleWithPrivateDataFields c) {
		System.out.println(c.toString()); // Better encapsulation to have the circle print it's own info.
		//System.out.println("Circle has radius " + c.getRadius() + " and Perimeter " + c.getPerimeter() + " and area " + c.getArea());
	}
	
	public static void printAreas(CircleWithPrivateDataFields c, int times) {
		System.out.printf("%10s\t\t%10s\n", "radius", "area");
		while(times > 0) {
			System.out.printf("%10f\t\t%10.4f\n", c.getRadius(), c.getArea());
			
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}

}
