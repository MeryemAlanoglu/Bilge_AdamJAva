package week02;

public class SingleOpetrator {
    public static void main(String[] args) {
        // Değişken Tanımlaması:
        int number1 =87;
        int number2 =13;
        boolean condition = true;

        // On arttırma ve Azaltma Operatörü:
        System.out.println("(A) Degeri: "+ number1 + "\t(++A) Değeri: "+ (++number1));
        System.out.println("(B) Degeri: "+ number2+ "\t(--B) Degeri:"+ (--number2));
        // Sonra arttırma azaltma operatörü:
        System.out.println("(A) Degeri: "+ number1 + "\t(A++) Değeri: "+ (number1++));
        System.out.println("(B) Degeri: "+ number2+ "\t(B--) Degeri:"+ (number2--));
        System.out.println("(A) Degeri: "+ number1 + "B Değeri: "+ (number2));
        // Mantıksal degıl operatoru
        System.out.println("Degil (!): "+!condition);

    }
}
