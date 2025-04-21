package dsa.pattern.creational.factory.message;

public class TextMessage implements Message {

	@Override
	public String getContent() {
		return "Text data";
	}

}
