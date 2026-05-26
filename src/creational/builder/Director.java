package creational.builder;

public class Director {

    public void constructSportCar(Builder builder){
        builder.setCarType(CarType.SPORT_CAR);
        builder.setEngine(new Engine(3.0 , 0));
        builder.setSeats(2);
    }

    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1.2 , 0));
        builder.setSeats(4);
    }

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5 , 0));
    }
}
