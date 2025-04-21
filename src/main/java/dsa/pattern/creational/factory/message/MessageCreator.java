package dsa.pattern.creational.factory.message;

public abstract class MessageCreator {

	public Message getMessage() {
		System.out.println("Invoked MessageCreator.getMessage()");
		Message msg = createMessage();

		System.out.println("Loading default headers");

		return msg;
	}

	public abstract Message createMessage();

}
