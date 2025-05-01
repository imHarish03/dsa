package dsa.pattern.structural.decorator.notification;

public class BasicNotifier implements Notifier {

    @Override
    public String sendMessage(String message) {
        return "Basic Notifier: " + message;
    }
}
