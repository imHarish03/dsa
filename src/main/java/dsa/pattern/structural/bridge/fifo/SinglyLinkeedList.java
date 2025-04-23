package dsa.pattern.structural.bridge.fifo;

public class SinglyLinkeedList<T> implements LinkedList<T> {

	private class Node {
		private Object data;
		private Node next;

		private Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private int size;
	private Node top;
	private Node last;

	@Override
	public void addFirst(T element) {

		if (top == null) {
			last = top = new Node(element, null);
		} else {
			top = new Node(element, top);
		}
		size++;
	}

	@Override
	public T removeFirst() {
		if (top == null) {
			return null;
		}
		@SuppressWarnings("unchecked")
		T temp = (T) top.data;
		if (top.next != null) {
			top = top.next;
		} else {
			top = null;
			last = null;
		}
		size--;
		return temp;
	}

	@Override
	public int getSize() {
		return size;
	}

}
