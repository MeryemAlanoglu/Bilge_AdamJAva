package week03.oop.principles.inheritance;

public class Dog extends Animal{
    public Dog() {
    }
    public void display(){
        System.out.println( " My name is " + name);
    }
    public void eat() {
        super.eat();
        System.out.println("Dog can eat");

    }


}
