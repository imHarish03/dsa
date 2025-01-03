package dsa.doublylinkedlist;

public class Node {
	int data;
	Node next;
	Node head;

	Node(int data1, Node head, Node next1) {
		this.data = data1;
		this.head = head;
		this.next = next1;
	}

	Node(int data1, Node head) {
		this.data = data1;
		this.head = head;
	}

	Node(int data1) {
		this.data = data1;
		this.next = null;
	}

}
