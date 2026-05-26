package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ComboMeal implements MenuItem{
    private String name;
    private List<MenuItem> items = new ArrayList<>();

    public ComboMeal(String name) {
        this.name = name;
    }

    public void add(MenuItem item ){
        items.add(item);
    }

    @Override
    public void print() {
        System.out.println("Набор [" + name + "]. Внутри:");
        for (MenuItem item : items) {
            item.print();
        }
        System.out.println("Итого за набор "+ getPrice()+ "грн");
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total+=item.getPrice();
        }
        return total;
    }
}
