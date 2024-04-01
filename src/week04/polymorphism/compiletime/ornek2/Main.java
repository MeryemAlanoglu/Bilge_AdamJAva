package week04.polymorphism.compiletime.ornek2;

public class Main{
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.sum(10,20));
        System.out.println(calculator.sum(10.5,20.5 ));
        System.out.println(calculator.sum(10.5,20.5,30.5));
        System.out.println(calculator.sum(10.5,20.5,30.5,40.7));
    }
}

