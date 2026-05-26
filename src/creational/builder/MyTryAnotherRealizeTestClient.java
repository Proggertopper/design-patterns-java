package creational.builder;

public class MyTryAnotherRealizeTestClient {
    public static void main(String[] args) {
        MyTryAnotherRealizeBuilderCar car = new MyTryAnotherRealizeBuilderCar.Builder().setCarType(CarType.SPORT_CAR).setCarEngine(new Engine(3.0 , 0)).build();
        System.out.println(car.getType());

    }
}
