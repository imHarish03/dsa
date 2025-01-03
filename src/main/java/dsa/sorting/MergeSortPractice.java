package dsa.sorting;

public class MergeSortPractice {
	public static void main(String[] args) {

		int arr[] = { 5, 6, 1, 3, 2, 4, 1 };

		mergeSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array");
		printArr(arr);
	}

	private static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}

	}

	private static void merge(int[] arr, int left, int mid, int right) {

		int n1 = mid - left;
		int n2 = right - mid + 1;

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for (int x = 0; x < n1; x++) {
			arr1[x] = arr[left + x];
		}

		for (int y = 0; y < n2; y++) {
			arr2[y] = arr[mid + 1 + y];
		}

		System.out.println("Left: " + left + ", Mid: " + mid + ", Right:" + right);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "-");
		}

		System.out.println("");
	}

}
