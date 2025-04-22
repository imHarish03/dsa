package dsa.pattern.structural.adapter.email;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationService {
    private static final Map<String, Supplier<EmailService>> SERVICE_MAP = new HashMap<>();

    static {
        SERVICE_MAP.put("sendgrid", () -> new SendGridAdapter(new SendGridAPI()));
    }

    public static EmailService getService(String type) {
        Supplier<EmailService> supplier = SERVICE_MAP.get(type.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Unsupported Email Service: " + type);
    }

    public static void notify(String type, String subject, String message) {
        EmailService emailService = getService(type);
        emailService.sendEmail("b0r6e@example.com", subject, message);
    }
}
