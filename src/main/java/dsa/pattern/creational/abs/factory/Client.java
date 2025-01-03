package dsa.pattern.creational.abs.factory;

public class Client {

	public static void main(String[] args) {

		createResource(new ResourceFactoryAzure());

	}

	private static void createResource(ResourceFactory resourceFactory) {

		Instance is = resourceFactory.createInstance(Instance.Capacity.small);
		Storage st = resourceFactory.ctreateStorage(12);

		is.attachStorage(st);

		is.start();
		is.stop();
	}

}
