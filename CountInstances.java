package suncoastCh5Practice;

public class CountInstances {

	public static void main(String[] args) {

		
		createManySlogans();
		int numberOfSlogans = Slogan.getCount();
		System.out.println("Slogans created = " + numberOfSlogans);

	}
	
	public static void createManySlogans() {
		Slogan obj = new Slogan("Remember the Alamo");
		
		System.out.println(obj);
		
		obj = new Slogan("Don't worry, be happy");
		System.out.println(obj);
		
		obj = new Slogan("Lve free or die");
		System.out.println(obj);

	}
}
