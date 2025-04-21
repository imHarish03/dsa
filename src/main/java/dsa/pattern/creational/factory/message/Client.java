package dsa.pattern.creational.factory.message;

public class Client {

	public static void main(String[] args) {
		printMessage(new MessageCreator() {
			@Override
			public Message createMessage() {
				return new TextMessage();
			}
		});
	}

	private static void printMessage(MessageCreator messageCreator) {
        Message msg = messageCreator.createMessage();
		String s = msg.getContent();

		System.out.println(s);
	}

}
