package dsa.pattern.creational.abs.factory.cloud.storage;

public abstract class ResourceFactory {

	abstract Instance createInstance(Instance.Capacity capacity);

	abstract Storage ctreateStorage(int mib);

}
