package creational.builder;

public class CarBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;

    @Override
    public CarBuilder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public Car getResult(){
        return new Car(type , engine , seats);
    }
}
