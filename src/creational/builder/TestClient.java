package creational.builder;

public class TestClient {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getType());

        ManualBuilder builder2 = new ManualBuilder();
        director.constructSUV(builder2);
        Manual manual = builder2.setEngine(new Engine(3.0 , 0)).setCarType(CarType.CITY_CAR).setSeats(4).getResult();

        System.out.println(manual.getSeats());
    }
}
