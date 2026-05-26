package behavioral.mediator;

public class TestClient {
    public static void main(String[] args) {
        AirConditioner conditioner = new AirConditioner();
        TemperatureSensor sensor = new TemperatureSensor();

        SmartHomeHub smartHomeHub = new SmartHomeHub(conditioner , sensor);

        sensor.detectHeat();
    }
}
