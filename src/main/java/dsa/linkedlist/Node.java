package dsa.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class Node {
	int data;
	Node next;

	Node(int data1, Node next1) {
		this.data = data1;
		this.next = next1;
	}

	Node(int data1) {
		this.data = data1;
		this.next = null;
	}

	public static int singleNonDuplicate(ArrayList<Integer> arr) {
		int n = arr.size(); // Size of the array.
		if (n == 1)
			return arr.get(0);

		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));

			// Check for first index:
			if (i == 0) {
				if (!arr.get(i).equals(arr.get(i + 1)))
					return arr.get(i);
			}
			// Check for last index:
			else if (i == n - 1) {
				if (!arr.get(i).equals(arr.get(i - 1)))
					return arr.get(i);
			} else {
				if (!arr.get(i).equals(arr.get(i - 1)) && !arr.get(i).equals(arr.get(i + 1)))
					return arr.get(i);
			}
		}

		// Dummy return statement:
		return -1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6));
		int ans = singleNonDuplicate(arr);
		System.out.println("The single element is: " + ans);
	}

}
