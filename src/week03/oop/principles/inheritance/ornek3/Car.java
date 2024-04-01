package week03.oop.principles.inheritance.ornek3;

public class Car extends Vehicle{
    int numDoors;

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Car() {
        super();
    }

    @Override
    void start() {
        System.out.println("Car is starting");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping");
    }
}
