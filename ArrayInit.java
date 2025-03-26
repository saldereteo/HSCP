package test6Prep;

public class ArrayInit {

	public static void main(String[] args) {

		int[] arr1;

		int[] arr2 = new int[10];

		int[] arr3 = { 0, 0, 0, 0, 0 };

		int[] arr4 = new int[10];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = 0;
		}

		// ******************************************************
		String[] str = new String[5];
		str[0] = "abc";
		int x = str[0].length();
		// ****************************************************
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		for (int i = 1; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		for (int i = 0; i <= arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		for (int i = 1; i <= arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.println(arr2[i]);
		}

		// **********************************************************
		int[] ml = { 1, 0, 5, 0, 5, 4 };
		int ind = 0;
		int min = ml[0];
		for (int i = 0; i < ml.length; i++) {
			if (min >= ml[i]) {
				min = ml[i];
				ind = i;
			}
		}

		// ***********************************************************
		int[] arr10 = new int[10];
		int i = 0;
		for (i = 0; i < arr10.length; i++) {
			arr10[i] = 2 * i;
		}
		System.out.println(arr10[i]);
		// Can I access arr10[i] out here?
		// What is the value of i
		
		
		// Let's swap two variables in arr10
		//Will this work?
		int temp = arr10[0];
		arr10[1] = arr10[0];
		arr10[0] = arr10[1];
		
		
		// How about this?
		arr10[0] = arr10[1];
		arr10[1] = arr10[0];
		
		// How about this?
		
		int temp1 = arr10[0];
		arr10[0] = arr10[1];
		arr10[1] = temp;
//***************************************************************		
		// How can I reverse an array
		
		
		for( i = 0; i < arr10.length/2; i++) {
			int temp3 = arr10[i];
			arr10[i] = arr10[arr10.length -i -1];
			arr10[arr10.length -i -1] = temp3;
		}
		
	//************************************************************
		// When will this be a problem?
		String arg0 = args[0];
		String arg1 = args[1];
		String arg2 = args[2];
		
	//**********************************************************
		// What will be the affect on arr10 as a result of this call
		mystery(arr10);
		
	//************************************************************
		// What is the effect on arr10 as a result of this loop
		
		for(int value : arr10) {
			value *= 2;
		}
		for(i = 0; i < arr10.length; i++) {
			arr10[i] *= 2;
		}
	}
	
	public static void mystery(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 2 * arr[i];
		}
	}
}
