package dsa.pattern.creational.abs.factory;

public class InstanceAWS implements Instance {

	private Storage storage;

	@Override
	public void start() {
		System.out.println("AWS instance started");
	}

	@Override
	public void stop() {
		System.out.println("AWS instance stopped");
	}

	@Override
	public void attachStorage(Storage storage) {
		this.storage = storage;
	}

}
