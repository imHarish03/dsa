package dsa.pattern.creational.factory;

public class TextMessage implements Message {

	@Override
	public String getContent() {
		return "Text data";
	}

}
