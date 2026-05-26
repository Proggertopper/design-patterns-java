package behavioral.mediator;

public class TemperatureSensor extends Component{
    public void detectHeat(){
        System.out.println("Датчик: Фиксирую жару +30°C!");
        mediator.notify(this , "HOT");
    }
}
