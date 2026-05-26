package behavioral.strategy;

public class CarStrategy implements RouteStrategy{

    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Едем на машине от "+ from + " в " + to);
    }
}
