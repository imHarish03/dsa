package dsa.pattern.creational.abs.factory.cloud.storage;

public interface Instance {
	
	enum Capacity{micro, small, large}

	void start();

	void stop();

	void attachStorage(Storage storage);

}
