class Car {
    private Engine engine; // Composition: Car cannot exist without an Engine

    Car(String engineType) {
        this.engine = new Engine(engineType);
    }

    void startCar() {
        engine.start();
        System.out.println("Car is ready to drive!");
    }
}
