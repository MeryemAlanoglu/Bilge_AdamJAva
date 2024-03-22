package week02;

public class AritmeticOperator {
    public static void main(String[] args) {
        int number1= 25, number2= 3, number3= 17;
        String websiteName= "Web Sitemiz:", websiteUrl = "www.bilgeadam.com";

         // Stringlerde ekleme operatörü kullanırsak:
System.out.println("Merhaba!\n" +websiteName + websiteUrl + " Sitemizi ziyaret edin!"); // ?-> alt + *

         //Ekleme-Cıkarma operatorleri:
         System.out.println("A+B = "+ ( number1 +number2));
         System.out.println("A-C= " + (number1-number3));
         // Carpma Ve Bolme Operatorleri
         System.out.println("A*B ="+ (number1*number2));
         System.out.println("A/5= "+ (number1/5));
         // Mod Alma Operatorleri:
         System.out.println("C%B= "+ (number3%number2));

         System.out.println((2+5));


    }
}
