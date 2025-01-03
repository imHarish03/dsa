package dsa.challenge;

public class Concatenation {

	public static void main(String[] args) {
		int arr[] = { 8, 5, 9, 4, 2, 5, 1 };
		// System.out.println(getConcatenation(arr));

		boolean a = true;
		boolean b = !a;
		System.out.println(a && b);
	}

	public static int[] getConcatenation(int[] nums) {

		//
		int[] arr = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[i];
			arr[i + nums.length] = nums[i];
		}

		return arr;
	}

}
