package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Observer> subscribers = new ArrayList<>();
    private String availableProduct;

    public void subscribe(Observer subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber){
        subscribers.remove(subscriber);
    }

    public void addProduct(String product){
        this.availableProduct = product;
        System.out.println("Магазин: на склад поступил товар "+ product);
        notifySubscribers();
    }

    public void notifySubscribers(){
        for (Observer subscriber : subscribers) {
            subscriber.update(availableProduct);
        }
    }
}
