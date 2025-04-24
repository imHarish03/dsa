package dsa.pattern.exercise.demo1.notification;

import dsa.pattern.exercise.demo1.request.SMSNotificationRequest;

public class SMSNotification implements Notification<SMSNotificationRequest> {

    @Override
    public void notifyUser(SMSNotificationRequest request) {
    System.out.println("SMS");
    }
}
