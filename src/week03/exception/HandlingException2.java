package week03.exception;

public class HandlingException2 {
    public static void main(String[] args) {
        String name = null;
        try {
            name.toUpperCase();
            System.out.println("try blok içi");
        } catch (NullPointerException e) {
            e.printStackTrace();
            ;//try-catch'e almasak görünecek hatayı konsola yazdırır.
            System.out.println(e.getMessage());
            System.out.println("Caught NPE");
        } finally {
            System.out.println("Hatayı yakala");
        }
        System.out.println("Kodun Bitişi");
    }
}

