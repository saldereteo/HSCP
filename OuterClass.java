package suncoastCh5Practice;

public class OuterClass {
	
	
	private String outerClassVariable = "outerClassVariable";
	private static String outerClassStaticVariable = "outerClassStaticVariable";
	
	private InnerClass inner = new InnerClass();
	
	// Print private inner class data from outer class
	public void printInnerData() {
		System.out.println("Inner class variable value = " +  inner.innerClassVariable);
	}
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		
		// Print inner class data from outer class
		outer.printInnerData();
		
		// Print outer class data from inner class
		outer.inner.printOuterData();
		
		// Print static inner class data from outer class
		System.out.println(StaticInnerClass.staticInAStatic);
		
		// Print static outer class data from static inner class
		StaticInnerClass.printOuterDataFromStaticClass();
		
	}
	
	private class InnerClass {
		private String innerClassVariable = "innerClassVariable";
		//private static String  staticInnerVariable = "Static Inner Variable"; //static variable inside a non-static inner class
		
		// Print outer class data from inner class
		public void printOuterData() {
			System.out.println("Outer class variable value = " + outerClassVariable);
		}		
	}
	
	private static class StaticInnerClass {
		private static String staticInAStatic = "StaticInAStatic";
		// Print static outer class data from static inner class
		private static void printOuterDataFromStaticClass() {
			//System.out.println(outerClassVariable);
			
			
			System.out.println(outerClassStaticVariable);
		}
	}


}
