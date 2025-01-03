package dsa.pattern.creational.factory;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		System.out.println("Invoked JSONMessageCreator.createMessage()");
		return new JSONMessage();
	}

}
