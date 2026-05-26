package structural.composite;

public class TestClient {
    public static void main(String[] args) {
        MenuItem burger = new Dish("Бургер" , 250);
        MenuItem cola = new Dish("Кола" , 100);
        MenuItem naggets = new Dish("нагетсы" , 150);

        ComboMeal smallMeal = new ComboMeal("smallMeal");
        smallMeal.add(burger);
        smallMeal.add(cola);

        ComboMeal bigMeal = new ComboMeal("happyMeal");
        bigMeal.add(burger);
        bigMeal.add(naggets);
        bigMeal.add(cola);
        bigMeal.add(smallMeal);

        System.out.println("отлично работает и для множества объектов: ");
        bigMeal.print();
        System.out.println();

        System.out.println("отлично работает и для одного объекта");
        burger.print();
    }
}
