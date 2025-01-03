package dsa.pattern.creational.abs.factory;

public abstract class ResourceFactory {

	abstract Instance createInstance(Instance.Capacity capacity);

	abstract Storage ctreateStorage(int mib);

}
