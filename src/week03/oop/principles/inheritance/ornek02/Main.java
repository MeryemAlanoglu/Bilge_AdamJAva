package week03.oop.principles.inheritance.ornek02;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle("orange",10);
        circle.draw();
        System.out.println(circle.calculateArea());

        Rectangle restangle=new Rectangle("Red", 10,5);
        restangle.draw();
        System.out.println(restangle.calculateArea());

    }
}
