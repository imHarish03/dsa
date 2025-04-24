package dsa.pattern.exercise.demo1.request;

public interface NotificationRequest {
    NotificationType  getType(); // "sms", "email", or "fcm"
}
