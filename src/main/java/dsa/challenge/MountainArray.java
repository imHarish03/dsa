package dsa.challenge;

public class MountainArray {

	public static void main(String[] args) {

		int[] nums1 = new int[] { 0, 3, 2, 1, 2, 3, 1 };
		System.out.println(validMountainArray(nums1));

	}

	private static boolean validMountainArray(int[] arr) {

		if (arr.length < 3)
			return false;
		int l = 0;
		int r = arr.length - 1;

		while (l + 1 < arr.length - 1 && arr[l] < arr[l + 1])
			l++;

		while (r - 1 > 0 && arr[r] < arr[r - 1])
			r--;

		return l == r;
	}

	/*
	 * public static boolean validMountainArray(int[] arr) {
	 * 
	 * boolean isMountain = false; int index = 0;
	 * 
	 * for (int i = 0; i < arr.length - 1; i++) {
	 * 
	 * if (arr[i] < arr[i + 1]) { index++; continue; } else if (index > 0) { break;
	 * } else { return false; } }
	 * 
	 * System.out.println("Demo: " + index);
	 * 
	 * for (int i = index; i < arr.length - 1; i++) { isMountain = false;
	 * 
	 * if (arr[i] > arr[i + 1]) { isMountain = true; } else { break; } } return
	 * isMountain; }
	 */

}
