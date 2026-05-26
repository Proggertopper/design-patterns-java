package structural.composite;

public class Dish implements MenuItem{
    private String name;
    private double price;

    public Dish(String name , double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public void print() {
        System.out.println("Это блюдо "+ name + " - стоит "+ price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
