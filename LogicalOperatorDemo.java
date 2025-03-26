package suncoastChapter3;

public class LogicalOperatorDemo {
	
	public static void main(String[] args) {
		
		boolean a = (1 < 2);
		System.out.println("a = " + a);
		boolean b = (2 > 3);
		System.out.println("b = " + b);
		boolean c = (2 < 3);
		System.out.println("c = " + c);
		boolean bVal = (a  && b) ;
		System.out.println("(a && b) is " + bVal);
		
		bVal = ( a  && c);
		
		System.out.println("( a && c)  is " + bVal);
		
		bVal = (a || b);
		System.out.println("( a || b)  is " + bVal);
		
		bVal = ( a  ^ b);
		System.out.println("( a ^ b)  is " + bVal);
		
		bVal = ( a ^ c);
		
		System.out.println("( a ^ c)  is " + bVal);
		
		System.out.println("!a = " + !a);
	}

}
