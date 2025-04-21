package dsa.pattern.creational.factory.notify;

import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        Supplier<Notification> supplier = MAP.get(type.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Invalid notification type: " + type);
    }

    private static final Map<String, Supplier<Notification>> MAP = Map.of(
            "email", EmailNotification::new
    );
}
