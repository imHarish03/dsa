package dsa.pattern.creational.factory;

public class Client {

	public static void main(String[] args) {

		printMessage(new TextMessageCreator());
	}

	private static void printMessage(MessageCreator messageCreator) {

		Message msg = messageCreator.createMessage();
		String s = msg.getContent();

		System.out.println(s);

	}

}
