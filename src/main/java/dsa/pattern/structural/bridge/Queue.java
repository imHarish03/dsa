package dsa.pattern.structural.bridge;

public class Queue<T> implements FifoCollection<T> {
	private LinkedList<T> list;

	public Queue(LinkedList<T> list) {
		this.list = list;
	}

	@Override
	public void offer(T element) {

	}

	@Override
	public T poll() {
		return list.removeFirst();
	}
}
