package creational.factory;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Сообщение отправлено через SMS : " + message);
    }
}
