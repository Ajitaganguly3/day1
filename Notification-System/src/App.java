import entity.User;
import notificationFactory.NotificationFactory;
import service.NotificationService;

public class App {
    public static void main(String[] args) throws Exception {
        User jay = new User();
        jay.addNotification(NotificationFactory.createNotification("push", "Hii"));
        jay.addNotification(NotificationFactory.createNotification("email", "You receive hi message"));
        NotificationService notificationService = new NotificationService();
        notificationService.addUser(jay);
        notificationService.sendNotification();
    }
}
