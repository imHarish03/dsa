package dsa.pattern.exercise.demo1.request;

public class EmailNotificationRequest implements NotificationRequest {
    private String to;
    private String cc;
    private String subject;
    private String body;

    private EmailNotificationRequest(Builder builder) {
        this.to = builder.to;
        this.cc = builder.cc;
        this.subject = builder.subject;
        this.body = builder.body;
    }

    public NotificationType  getType() { return NotificationType.EMAIL; }

    // Getters...
    public String getTo() { return to; }
    public String getCc() { return cc; }
    public String getSubject() { return subject; }
    public String getBody() { return body; }

    public static class Builder {
        private String to;
        private String cc;
        private String subject;
        private String body;

        public Builder to(String to) { this.to = to; return this; }
        public Builder cc(String cc) { this.cc = cc; return this; }
        public Builder subject(String subject) { this.subject = subject; return this; }
        public Builder body(String body) { this.body = body; return this; }

        public EmailNotificationRequest build() {
            return new EmailNotificationRequest(this);
        }
    }
}
