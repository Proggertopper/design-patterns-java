package behavioral.strategy;

public class TestClient {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new CarStrategy());
        context.executeRoute("лос-анджелес" , "Днепр");

        context.setStrategy(new PlaneStrategy());
        context.executeRoute("Варшава" , "Львів");
    }
}
