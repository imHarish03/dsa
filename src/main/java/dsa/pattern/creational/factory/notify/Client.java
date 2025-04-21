package dsa.pattern.creational.factory.notify;

public class Client {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("email");
        notification.notifyUser();
    }
}
