package dsa.pattern.exercise.demo4;

public class NotificationProxy implements NotificationSystem {

    private NotificationSystem notificationSystem;
    private String userRole;

    public NotificationProxy(NotificationSystem notificationSystem, String userRole) {
        this.notificationSystem = notificationSystem;
        this.userRole = userRole;
    }

    @Override
    public void sendNotification(String message) {
        if (!"ADMIN".equalsIgnoreCase(userRole)) {
            System.out.println("[PROXY] Access Denied: You are not allowed to send notifications.");
            return;
        }
        System.out.println("[PROXY] Access granted. Proceeding...");
        notificationSystem.sendNotification(message); // delegate to actual/decorated object
    }
}
