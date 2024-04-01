package week03.oop.principles.inheritance.ornek3;

public class Motorcycle extends Vehicle{
    boolean hasSidecar;

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Motorcycle() {
        super();
    }

    @Override
    void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle is stopping");
    }
}
