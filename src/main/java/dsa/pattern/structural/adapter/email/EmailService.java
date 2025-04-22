package dsa.pattern.structural.adapter.email;

public interface EmailService {
    public void sendEmail(String to, String subject, String body);
}
