package dsa.pattern.exercise.demo1;

import dsa.pattern.exercise.demo1.request.EmailNotificationRequest;

public class Client {
    public static void main(String[] args) {
        EmailNotificationRequest emailRequest = new EmailNotificationRequest.Builder()
                .to("harish@gmail.com")
                .cc("cc@example.com")
                .subject("Hello")
                .body("Welcome to AppSteer")
                .build();

        NotificationFactory.notifyUser(emailRequest);
    }
}
