package service;

import java.util.ArrayList;
import java.util.List;

import entity.User;
import notification.Notification;

public class NotificationService {

    private List<User> users = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
    }

    public void sendNotification(){
        for (User user : users) {
            for (Notification notification : user.getNotifications()) {
                notification.send();
            }
        }
    }
    
}
