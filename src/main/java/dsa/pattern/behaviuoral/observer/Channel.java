package dsa.pattern.behaviuoral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	private List<Subscribers> subscribers;
	private String title;

	public Channel() {
		this.subscribers = new ArrayList<>();
	}

	public void subscribe(Subscribers sub) {
		this.subscribers.add(sub);
	}
	
	public void unSubscribe(Subscribers sub) {
		this.subscribers.remove(sub);
	}
	
	public void notifySubscribers(String video) {
		subscribers.forEach(subs->subs.update(this));
	}
	
	public void upload (String title) {
		this.title=title;
		notifySubscribers(title);
	}

	public List<Subscribers> getSubscribers() {
		return subscribers;
	}

	public String getTitle() {
		return title;
	}
	

}
