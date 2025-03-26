package suncoastCh5Practice;

import java.util.Arrays;

public class TestRectangle {

	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle();
		
		
		Rectangle[] rArray = new Rectangle[2];
		rArray[0] = r1;
		rArray[1] = r2;
		
		Arrays.sort(rArray);
	}
}
