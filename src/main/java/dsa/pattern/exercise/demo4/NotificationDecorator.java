package dsa.pattern.exercise.demo4;

public abstract  class NotificationDecorator implements NotificationSystem{
    protected NotificationSystem notificationSystem;

    public NotificationDecorator(NotificationSystem notificationSystem) {
        this.notificationSystem = notificationSystem;
    }

    @Override
    public void sendNotification(String message) {
        notificationSystem.sendNotification(message);
    }

}
