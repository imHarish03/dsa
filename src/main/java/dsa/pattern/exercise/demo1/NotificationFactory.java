package dsa.pattern.exercise.demo1;


import dsa.pattern.exercise.demo1.notification.EmailNotification;
import dsa.pattern.exercise.demo1.notification.Notification;
import dsa.pattern.exercise.demo1.notification.SMSNotification;
import dsa.pattern.exercise.demo1.request.NotificationRequest;
import dsa.pattern.exercise.demo1.request.NotificationType;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {
    private static final Map<NotificationType , Notification<? extends NotificationRequest>> registry = new HashMap<>();

    static {
        registry.put(NotificationType.SMS, new SMSNotification());
        registry.put(NotificationType .EMAIL, new EmailNotification());
    }

    public static void notifyUser(NotificationRequest request) {
        Notification notification = registry.get(request.getType());
        if (notification == null) {
            throw new IllegalArgumentException("Invalid type: " + request.getType());
        }
        notification.notifyUser(request);
    }
}
