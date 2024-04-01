package week03.oop.principles.inheritance.ornek3;

public class Truck extends Vehicle{
    double cargoCapacity;

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Truck() {
        super();
    }

    @Override
    void start() {
        System.out.println("Truck is starting");
    }

    @Override
    void stop() {
        System.out.println("Truck is stopping");
    }
}
