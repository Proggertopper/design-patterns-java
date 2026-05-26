package behavioral.observer;

public class SmsCustomer implements Observer{

    private final String phone;

    public SmsCustomer(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(String productName) {
        System.out.println("Sms на номер "+ phone + " : Приезжайте, товар "+ productName + " уже ждет вас!");
    }
}
