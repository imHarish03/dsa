package dsa.pattern.structural.bridge.fifo;

public interface FifoCollection<T> {

	void offer(T eloement);

	T poll();

}
