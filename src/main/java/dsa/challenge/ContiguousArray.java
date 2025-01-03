package dsa.challenge;

public class ContiguousArray {

	public static int findMaxLength(int[] nums) {

		int counter = 0;
		for (int i = 0; i < nums.length - 1; i += 2) {

			int temp1 = nums[i];
			int temp2 = nums[i + 1];

			if (temp1 == 1) {
				if (temp1 == temp2 + 1)
					counter++;
			} else {
				if (temp1 == temp2 - 1)
					counter++;
			}
		}

		return counter;

	}

	public static void main(String[] args) {

		int length = findMaxLength(new int[] { 1, 0, 1, 0, 1, 1, 1, 0 });
		System.out.println(length);

	}

}
