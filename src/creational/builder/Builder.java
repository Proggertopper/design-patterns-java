package creational.builder;

public interface Builder {
    Builder setCarType(CarType type);
    Builder setEngine(Engine engine);
    Builder setSeats(int seats);
}
