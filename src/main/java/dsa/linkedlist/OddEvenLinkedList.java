package dsa.linkedlist;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
		Node head = convertToLinkedList(arr);
		System.out.println(head);

		Node out = oddEvenList(head);
		System.out.println(out);

	}

	private static Node convertToLinkedList(int[] arr) {

		Node head = new Node(arr[0]);
		Node mover = head;

		for (int i = 1; i < arr.length; i++) {
			Node node = new Node(arr[i]);
			mover.next = node;

			mover = node;
		}
		return head;
	}

	public static Node oddEvenList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node odd = head, even = head.next, evenHead = head.next;
		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}

		odd.next = evenHead;
		return head;
	}

}
