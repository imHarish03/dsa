package dsa.pattern.structural.bridge;

public interface FifoCollection<T> {

	void offer(T eloement);

	T poll();

}
