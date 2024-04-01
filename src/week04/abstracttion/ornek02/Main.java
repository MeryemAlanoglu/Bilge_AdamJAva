package week04.abstracttion.ornek02;

public class Main {
    public static void main(String[] args) {
        //shape sınıfından nesne oluşturulmaz. çünkü shape shape sınıfı soyut bir sınıftır .(Shape shape =new Shape)

        System.out.println("----Rectangle----");
        Rectangle rectangle=new Rectangle(5,3);
        System.out.println(rectangle.calculateArea());
        rectangle.draw();

        System.out.println("----Circle---");
        Circle circle=new Circle(3.5);
        System.out.println(circle.calculateArea());
        circle.draw();
    }
}
