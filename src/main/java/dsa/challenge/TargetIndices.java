package dsa.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 2, 3 };
		targetIndices(nums, 3);
	}

	public static List<Integer> targetIndices(int[] nums, int target) {

		int[] sortedData = sortArray(nums);
		System.out.println(sortedData);

		ArrayList<Integer> li = new ArrayList<>();
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				li.add(i);
		}
		return li;
	}

	private static int[] sortArray(int[] data) {

		for (int i = 0; i < data.length - 1; i++) {

			int min_index = i;
			for (int j = i + 1; j < data.length; j++) {

				if (data[j] < data[min_index])
					min_index = j;
			}

			int temp = data[min_index];
			data[min_index] = data[i];
			data[i] = temp;
		}
		return data;
	}

}
