package behavioral.mediator;

public class SmartHomeHub implements HomeMediator{
    private AirConditioner conditioner;
    private TemperatureSensor sensor;

    public SmartHomeHub(AirConditioner conditioner, TemperatureSensor sensor) {
        this.conditioner = conditioner;
        this.sensor = sensor;
        this.sensor.setMediator(this);
        this.conditioner.setMediator(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if(sender == sensor && event.equals("HOT")){
            conditioner.turnOn();
        }
    }
}
