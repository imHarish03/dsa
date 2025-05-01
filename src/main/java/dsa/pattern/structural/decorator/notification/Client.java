package dsa.pattern.structural.decorator.notification;

import dsa.pattern.structural.decorator.notification.decorator.CompressionDecorator;

public class Client {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();
        notifier = new CompressionDecorator(notifier);
        System.out.println(notifier.sendMessage("Hello"));
    }
}
