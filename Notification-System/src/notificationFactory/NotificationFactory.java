package notificationFactory;

import notification.Notification;
import notification.PushNotification;
import notification.EmailNotification;

public class NotificationFactory {
    public static Notification createNotification(String notificationType, String message) {
        switch (notificationType.toLowerCase()) {
            case "push":
                return new PushNotification(message);
            case "email":
                return new EmailNotification(message);
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
