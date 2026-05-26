package creational.builder;

public class Car {
    private CarType type;
    private int seats;
    private Engine engine;

    Car(CarType type , Engine engine , int seats){
        this.type = type;
        this.engine = engine;
        this.seats = seats;
    }


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
