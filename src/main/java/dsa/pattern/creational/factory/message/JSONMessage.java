package dsa.pattern.creational.factory.message;

public class JSONMessage implements Message {

	public String getContent() {
		return "{\"id\":1}";
	}

}
