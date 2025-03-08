public class Main2 {
    public static void main(String[] args) {
        // Composition: Car has an engine, and engine's lifecycle is tied to the car
        Car myCar = new Car("V8");
        myCar.startCar();

        System.out.println();

        // Aggregation: Bus has a driver, but a driver can exist independently
        Driver driver = new Driver("John");
        Bus myBus = new Bus(driver);
        myBus.showDriver();
    }
}
