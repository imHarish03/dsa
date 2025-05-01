package dsa.pattern.structural.decorator.notification.decorator;

import dsa.pattern.structural.decorator.notification.Notifier;

public abstract class NotificationDecorator implements Notifier {
    protected Notifier notifier;

    public NotificationDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public  String sendMessage(String message){
        return notifier.sendMessage(message);
    }

}
