package dsa.pattern.structural.decorator.notification.decorator;

import dsa.pattern.structural.decorator.notification.Notifier;

public class CompressionDecorator extends NotificationDecorator {

    public  CompressionDecorator (Notifier notifier) {
        super(notifier);
    }

    @Override
    public String sendMessage(String message) {
        String compressed = "[Compressed(" + message + ")]";
        return super.sendMessage(compressed);
    }
}
