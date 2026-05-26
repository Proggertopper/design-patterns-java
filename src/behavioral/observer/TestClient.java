package behavioral.observer;

public class TestClient {
    public static void main(String[] args) {
        Store store = new Store();

        Observer ivan = new EmailCustomer("ivan124@gmail.com");
        Observer elena = new SmsCustomer("380953225199");

        store.subscribe(ivan);
        store.subscribe(elena);

        store.addProduct("молоко");

        System.out.println("\n--- Иван решил отписаться ---");
        store.unsubscribe(ivan);

        store.addProduct("виски");
    }
}
