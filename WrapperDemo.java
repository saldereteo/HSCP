package suncoastChapter2;


public class WrapperDemo {
	public static void main(String[] args) {
		// Create a Double from a double. Implicit casting, 
		double d = 16.3;
		Double wrapperD = d; // auto conversion to Double
		System.out.println("Value of Double  = " + wrapperD);
		
		int x = wrapperD.intValue();
		System.out.println(x);
		
		// Create a double from a Double. Implicit casting
		 wrapperD = new Double(13.5);
		 d = wrapperD.doubleValue();
		 
		 System.out.println("Value of double  = " + d);
		 d = wrapperD; // auto conversion to primitive type
		 
		 System.out.println("Value of double with implicit casting = " + d);
		 
		 // Create a Double from a String
		 wrapperD = Double.valueOf("9.8");
		 System.out.println("Value of Double from a String = " + wrapperD);
		 
		 // create a double from a String
		 double d1 = Double.parseDouble("123.45");
		 System.out.println("double value from a String= " + d1);
		 
		 //Autoboxing
		 Double d2 = 123.45; //
		 Double d3 = d1 - 2;
		 System.out.println("Compare d3 to d2 " + d2.compareTo(d3));

		 System.out.println("Compare d3 to d2 using equals " + d2.equals(d3));
		 
		 //Unboxing
		 d1 = d2;
	}
	
}
