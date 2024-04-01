package week03.oop.principles.inheritance.ornek02;

import week03.constructor.ConstructorOverLoding;

public class Circle extends Shape{
    double radius;
    Circle(String color,double radius){
        this.color=color;
        this.radius=radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    double calculateArea(){
    return Math.PI*Math.pow(radius,2);
    }
}


