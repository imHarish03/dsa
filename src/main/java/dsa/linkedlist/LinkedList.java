package dsa.linkedlist;

public class LinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
		Node head = convertarr2LL(arr);

		System.out.println("Convertor: " + head.data);

		Node temp = reverseNode(head);
		print(temp);

	}

	private static Node convertarr2LL(int[] arr) {

		Node head = new Node(arr[0]);
		Node mover = head;

		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = mover.next;
		}
		return head;
	}

	private static Node reverse(Node head) {
		Node curr = head, prev = null;

		while (curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;

			prev = curr;
			curr = nextNode;
		}
		return prev;
	}

	private static void print(Node node) {

		Node temp = node;

		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}

	}

	private static Node reverseNode(Node node) {
		Node prev = null, current = node;

		while (current != null) {
			Node temp = current.next;
			current.next = prev;

			prev = current;
			current = temp;
		}
		return prev;
	}

}
