package suncoastCh5Practice;
import java.util.Scanner;
public class ExceptionExample {


	// Main method will compute the area of a circle and
	//throw an exception in the case where the user input is less than zero
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a circle");
		double radius = input.nextInt();
		if (radius <= 0) {
			throw new Exception ("Invalid radius " + radius);
		}
		System.out.println("the area of the circle is " + Math.PI * Math.pow(radius,  2));
				
	}
}
