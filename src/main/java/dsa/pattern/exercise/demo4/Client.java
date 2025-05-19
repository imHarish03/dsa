package dsa.pattern.exercise.demo4;

public class Client {

    public static void main(String[] args) {
        NotificationSystem system = new GeneralNotification();
        system = new CompressedMessage(system); // Decorator
        system = new NotificationProxy(system, "ADMIN"); // Proxy

        system.sendNotification("Welcome, Harish!");
    }
}
