class Engine {
    private String type;

    Engine(String type) {
        this.type = type;
    }

    void start() {
        System.out.println(type + " Engine is starting...");
    }
}
