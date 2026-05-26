package creational.factory;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void sentNotification(String message){
        Notification notification = createNotification();
        notification.notifyUser(message);
    }

}
