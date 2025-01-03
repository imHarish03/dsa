package dsa.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
		Node head = convertToLinkedList(arr);
		Node reverseData = convertToReverse(head);

		System.out.println(reverseData);
		// System.out.println("isCircular: " + checkCircular(reverseData));

		Node n = reverseBetween(head, 2, 5);
		System.out.println(n);

	}

	private static Node convertToReverse(Node head) {

		Node prev = null;
		Node current = head;

		while (current != null) {
			Node next = current.next;
			current.next = prev;

			prev = current;
			current = next;

		}
		return prev;

	}

	public static Node reverseBetween(Node head, int left, int right) {

		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;

		// Move prev to the node before the sublist to be reversed
		for (int i = 0; i < left - 1; i++) {
			prev = prev.next;
		}

		System.out.println("Prev: " + prev.data);

		Node current = prev.next;
		Node nextNode;

		System.out.println("Current: " + current.data);
		// Reverse the sublist from left to right
		for (int i = 0; i < right - left; i++) {
			nextNode = current.next;
			current.next = nextNode.next;
			nextNode.next = prev.next;
			prev.next = nextNode;
		}

		return dummy.next;

	}

	private static boolean checkCircular(Node node) {
		Node slow = node.next;
		Node fast = node.next;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;

		}

		return false;
	}

	/*
	 * private static Node convertToReverse(Node head) {
	 * 
	 * Node prev = null, current = head;
	 * 
	 * while (current != null) {
	 * 
	 * System.out.println("Current: " + current.data); Node next = current.next;
	 * current.next = prev;
	 * 
	 * prev = current; current = next; } return prev;
	 * 
	 * }
	 */

	private static Node convertToLinkedList(int[] arr) {

		Node head = new Node(arr[0]);
		Node mover = head;

		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = mover.next;
		}
		return head;
	}

}
