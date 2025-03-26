package Patterns;
/**
 * How to find the masx and min of an array
 * @author 1116444
 *
 */
public class MaxAndMin {
	public static void main(String[] args) {
		
		int[] v = {1, 2, 3, 4, -10, 12, 1, 6};
		int max = v[0];
		int min = v[0];
		for(int i = 0; i < v.length; i++) {
			
			if (max < v[i]) {
				max = v[i];
			}
			
			if (min > v[i]) {
				min = v[i];
			}
			
			System.out.println("Max = " + max);
			System.out.println("Min = " + min);
		}
	}

}
