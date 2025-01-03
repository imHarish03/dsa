package dsa.sorting;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 2, 4 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array");
		printArr(arr);
	}

	static void quickSort(int arr[], int low, int high) {

		System.out.println("Low: " + low + ", High:" + high);

		if (low < high) {

			int pi = partition(arr, low, high);
			System.out.println(pi);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);

		}

		printArr(arr);

	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}

			swap(arr, i + 1, high);

		}

		return (i + 1);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "<");

		}

		System.out.println("\n=============");
	}

	private static void swap(int[] arr, int i, int j) {

		System.out.println("i:" + i + ", j:" + j);

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
