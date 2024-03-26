package week03.exception;

public class HandlingExeption3 {
    public static void main(String[] args) {
        String name = null;


        if (name == null) {
            System.out.println("Lütfen bir isim giriniz!");
        } else {
            System.out.println(name.toUpperCase());
        }
    }
}
