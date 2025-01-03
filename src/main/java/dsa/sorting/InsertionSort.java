package dsa.sorting;

public class InsertionSort {
	
	public static void main(String[] args) {

		int arr[] = { 5, 6, 2, 3, 1, 8, 4 };
		System.out.println("Before Sorting");
		printData(arr);

		for (int i = 1; i < arr.length; i++) {

			System.out.println("Iteration: " + i);
			int j = i - 1;
			int key = arr[i];

			while (j >= 0 && arr[j] > key) {
				System.out.println("Shifting Data: " + j + 1 + " " + arr[j]);
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		System.out.println("Itertaion: ");
		printData(arr);
	}

	static void printData(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(" ");
	}
}
