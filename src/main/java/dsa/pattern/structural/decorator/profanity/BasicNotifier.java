package dsa.pattern.structural.decorator.profanity;

import dsa.pattern.structural.decorator.profanity.Notifier;

public class BasicNotifier implements Notifier {

    @Override
    public String sendMessage(String message) {
        return "Basic Notifier: " + message;
    }
}
