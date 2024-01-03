package notification;

public class PushNotification implements Notification{

    private String message;

    public PushNotification(String message){
        this.message=message;
    }

    @Override
    public void send() {
        System.out.println("New Notification : "+message);
    }
    
}
