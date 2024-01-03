package notification;

public class EmailNotification implements Notification{

    private String message;

    public EmailNotification(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Email Notification : "+message);
    }
    
}
