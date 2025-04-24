package dsa.pattern.exercise.demo1.notification;

import dsa.pattern.exercise.demo1.request.EmailNotificationRequest;

public class EmailNotification implements Notification<EmailNotificationRequest> {

    @Override
    public void notifyUser(EmailNotificationRequest request) {
        System.out.println("Email sent");
    }
}
