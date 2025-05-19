package dsa.pattern.exercise.demo4;

public class CompressedMessage extends NotificationDecorator{

    public CompressedMessage(NotificationSystem notificationSystem) {
        super(notificationSystem);
    }

    @Override
    public void sendNotification(String message) {
        message = "[Compressed] " + message;
        System.out.println("Compressed Notification: " + message);
    }
}
