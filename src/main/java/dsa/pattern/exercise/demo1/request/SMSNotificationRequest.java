package dsa.pattern.exercise.demo1.request;

public class SMSNotificationRequest implements NotificationRequest {
    private String phoneNumber;
    private String message;

    private SMSNotificationRequest(Builder builder) {
        this.phoneNumber = builder.phoneNumber;
        this.message = builder.message;
    }

    public NotificationType  getType() { return NotificationType .SMS; }

    public String getPhoneNumber() { return phoneNumber; }
    public String getMessage() { return message; }

    public static class Builder {
        private String phoneNumber;
        private String message;

        public Builder phoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; return this; }
        public Builder message(String message) { this.message = message; return this; }

        public SMSNotificationRequest build() {
            return new SMSNotificationRequest(this);
        }
    }
}
