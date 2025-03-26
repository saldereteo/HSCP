package suncoastChapter6;

public class FindMax {
	
	public static void main(String[] args) {
		
		int [] x = new int[50];
		for(int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);
		}
		
		
		int max = x[0];
		int maxIndex = 0;
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
				maxIndex = i;
			}
			sum += x[i];
		}
		
		System.out.println("max = " + max);
		System.out.println("maxIndex = " + maxIndex);
	}

}
