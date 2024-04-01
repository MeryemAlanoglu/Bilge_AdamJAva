package week04.abstracttion.ornek01;

public abstract class Language {

    abstract void method1(); // method gövdesi olmaz sadece abstract sınıfta yazılır.

    void method2(){ //standart method gövdesi olur

        System.out.println("This is a regular method");
    }
}
