package week03.oop.principles.inheritance.ornek02;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void draw(){
        System.out.println("Drawing a Triangle");
    }
    double calculeArea(){
        return base*height/2;
    }
}
