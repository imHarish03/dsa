package dsa.pattern.structural.adapter.email;

public class SendGridAPI {
    public void triggerEmail(String to, String subject, String body) {
        System.out.println("Trigger Email by SendGrid: " + to + ", " + subject + ", " + body);
    }
}
