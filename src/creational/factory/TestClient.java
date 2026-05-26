package creational.factory;

public class TestClient {
    public static void main(String[] args) {
        executeAlert(new EmailNotificationFactory() , "Это с емеила");
        executeAlert(new SmsNotificationFactory() , "Это с смс");
    }

    public static void executeAlert(NotificationFactory notificationFactory , String msg){
            notificationFactory.sentNotification(msg);
    }
}
