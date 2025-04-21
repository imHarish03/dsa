package dsa.pattern.creational.factory.message;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
