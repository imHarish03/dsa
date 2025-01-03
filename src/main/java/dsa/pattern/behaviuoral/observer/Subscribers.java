package dsa.pattern.behaviuoral.observer;

public class Subscribers {
	private String userName;

	public Subscribers(String userName) {
		this.userName = userName;
	}

	public void update(Channel channel) {
		System.out.println(userName+"  Video Uploaded - "+ channel.getTitle());
	}
	
	public void subsribeChannel(Channel channel) {
		channel.subscribe(this);
	}

}
