package dsa.sorting;

public class MergeSortPractice2 {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 1, 3, 2, 4, 1 };

		mergeSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array");
	}

	private static void mergeSort(int[] arr, int low, int high) {

		if (low < high) {

			int median = (low + high) / 2;
			mergeSort(arr, low, median);
			mergeSort(arr, median + 1, high);

			merge(arr, low, median, high);

		}

	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int n1 = mid - low;
		int n2 = high - mid + 1;

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for (int c = low; c < mid; c++) {
			arr[c] = arr[low];
		}

		for (int d = mid; d < high; d++) {
			arr[d] = arr[mid + 1];
		}

	}

}
