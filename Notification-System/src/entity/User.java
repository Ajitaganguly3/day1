package entity;

import java.util.ArrayList;
import java.util.List;

import notification.Notification;

public class User {
    private String userId;

    private List<Notification> notifications = new ArrayList<>();

    public void addNotification(Notification notification){
        notifications.add(notification);
    }

    public List<Notification>  getNotifications(){
        return notifications;
    }

}
