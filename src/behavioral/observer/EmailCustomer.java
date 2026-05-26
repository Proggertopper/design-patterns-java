package behavioral.observer;

public class EmailCustomer implements Observer{

    private final String email;

    public EmailCustomer(String email) {
        this.email = email;
    }

    @Override
    public void update(String productName) {
        System.out.println("Email на " + email + " : Приезжайте, " + productName + " уже в продаже!");
    }
}
