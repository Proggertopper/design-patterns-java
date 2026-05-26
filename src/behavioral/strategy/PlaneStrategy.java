package behavioral.strategy;

public class PlaneStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Летим на самолете из "+ from + " в " + to);
    }
}
