package week03.oop.principles.inheritance.ornek02;

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(String color, double width, double height) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
    @Override
    double calculateArea() {
            return width * height;
        }
    }

