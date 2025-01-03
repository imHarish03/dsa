package dsa.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 8, 5, 9, 4, 2, 5, 1 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array");
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "-");
		}
		System.out.println();
	}

	private static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;
			System.out.println("Mid: " + mid);

			System.out.println("***********Low-mid***********");
			mergeSort(arr, left, mid);

			System.out.println("***********mid-high***********");
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {

		System.out.println("Left: " + left + ", Mid: " + mid + ", Right:" + right);

		int n1 = mid - left + 1;
		int n2 = right - mid;

		System.out.println(+n1 + " vs " + n2);

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for (int x = 0; x < n1; x++)
			arr1[x] = arr[left + x];

		for (int y = 0; y < n2; y++)
			arr2[y] = arr[mid + 1 + y];

		// Initial indices of first and second subarrays
		int i = 0, j = 0;

		int k = left;
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}

	}

}
