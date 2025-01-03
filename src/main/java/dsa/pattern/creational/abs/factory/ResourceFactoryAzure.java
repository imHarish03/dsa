package dsa.pattern.creational.abs.factory;

public class ResourceFactoryAzure extends ResourceFactory {

	@Override
	Instance createInstance(Instance.Capacity capacity) {
		return new InstanceAzure();
	}

	@Override
	Storage ctreateStorage(int mib) {
		return new StorageS3();
	}

}
