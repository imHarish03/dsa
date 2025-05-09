package dsa.pattern.structural.bridge.fifo;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkeedList<>());
		collection.offer(10);
		collection.offer(40);
		collection.offer(99);

		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		//
		System.out.println(collection.poll());
	}

}
