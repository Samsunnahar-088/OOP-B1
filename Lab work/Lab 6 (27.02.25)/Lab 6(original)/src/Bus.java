class Bus {
    private Driver driver; // Aggregation: Bus can exist without a driver

    Bus(Driver driver) {
        this.driver = driver;
    }

    void showDriver() {
        System.out.println("Bus driver is " + driver.name);
    }
}
