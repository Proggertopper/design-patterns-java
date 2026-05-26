package creational.builder;

public class ManualBuilder implements Builder{

    private CarType type;
    private Engine engine;
    private int seats;

    @Override
    public ManualBuilder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public ManualBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public ManualBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public Manual getResult(){
        return new Manual(type , engine , seats);
    }
}
