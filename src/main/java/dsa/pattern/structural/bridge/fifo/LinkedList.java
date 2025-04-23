package dsa.pattern.structural.bridge.fifo;

public interface LinkedList<T> {

	void addFirst(T element);

	T removeFirst();

	int getSize();

}
