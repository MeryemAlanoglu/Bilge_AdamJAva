package week03.oop.principles.inheritance.ornek3;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Vehicle vehicle = new Vehicle("volvo","s90",2024);
        vehicle.start();
        System.out.println(vehicle.brand + ", " + vehicle.model + ", " + vehicle.year);
        vehicle.stop();

        System.out.println();
        Car car=new Car("ferrari","812 Gts",2020,4 );
        car.start();
        System.out.println(car.brand + ", " + car.model+ ", " + car.year+", " + car.numDoors);
        car.stop();

        System.out.println();
        Motorcycle motorcycle=new Motorcycle(false);
        motorcycle.start();
        System.out.println(motorcycle.hasSidecar);
        motorcycle.stop();

        System.out.println();
        Truck truck = new Truck(17000);
        truck.start();
        System.out.println(truck.cargoCapacity);
        truck.stop();

    }
}
