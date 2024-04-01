package week03.oop.principles.inheritance.ornek3;

public class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(){
}

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void start(){
        System.out.println("Vehicle is starting");
}
    void stop() {
        System.out.println("Vehicle is stopping");

    }
    }