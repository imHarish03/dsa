package dsa.pattern.creational.abs.factory;

public class InstanceAzure implements Instance {

	private Storage storage;

	@Override
	public void start() {
		System.out.println("Azure instance started");
	}

	@Override
	public void stop() {
		System.out.println("Azure instance started");
	}

	@Override
	public void attachStorage(Storage storage) {
		this.storage = storage;
	}

}
