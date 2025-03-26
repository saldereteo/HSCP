package suncoastChapter6;
// Implementation of Insertion Sort
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 34, 16, 48, 9, 12, 58 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void insertionSort(int[] numbers) {
		for (int index = 1; index < numbers.length; index++) {
			int key = numbers[index];
			int position = index;
			while (position > 0 && numbers[position - 1] > key) {
				numbers[position] = numbers[position - 1];
				position--;
			}
			numbers[position] = key;
		}
	}
}
