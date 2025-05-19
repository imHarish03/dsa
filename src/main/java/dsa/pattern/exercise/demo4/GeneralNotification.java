package dsa.pattern.exercise.demo4;

public class GeneralNotification implements NotificationSystem {

    @Override
    public void sendNotification(String message) {
        System.out.println("General Notification: " + message);
    }
}
