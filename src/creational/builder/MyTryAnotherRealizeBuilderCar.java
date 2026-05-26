package creational.builder;

public class MyTryAnotherRealizeBuilderCar {
    private final CarType type;
    private final int seats;
    private final Engine engine;

    private MyTryAnotherRealizeBuilderCar(Builder builder){
        this.type = builder.type;
        this.engine = builder.engine;
        this.seats = builder.seats;
    }

    public CarType getType() { return type; }
    public int getSeats() { return seats; }
    public Engine getEngine() { return engine; }

    public static class Builder{
        private CarType type;
        private Engine engine;
        private int seats;

        public Builder setCarType(CarType type){
            this.type = type;
            return this;
        }

        public Builder setCarEngine(Engine engine){
            this.engine = engine;
            return this;
        }

        public Builder setCarSeats(int seats){
            this.seats = seats;
            return this;
        }

        public MyTryAnotherRealizeBuilderCar build(){
            return new MyTryAnotherRealizeBuilderCar(this);
        }
    }
}
