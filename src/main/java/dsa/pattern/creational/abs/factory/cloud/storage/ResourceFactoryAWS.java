package dsa.pattern.creational.abs.factory.cloud.storage;

public class ResourceFactoryAWS extends ResourceFactory {

	@Override
	Instance createInstance(Instance.Capacity capacity) {
		return new InstanceAWS();
	}

	@Override
	Storage ctreateStorage(int mib) {
		return new StorageS3();
	}

}
