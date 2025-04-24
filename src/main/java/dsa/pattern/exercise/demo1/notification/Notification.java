package dsa.pattern.exercise.demo1.notification;

import dsa.pattern.exercise.demo1.request.NotificationRequest;

public interface Notification<T extends NotificationRequest> {
    void notifyUser(T request);
}
