package week03.arrays;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

       /*

    kullanıcıdan 0 girene kadar hep sayılar alan 0 girildiğinde o zamana kadar girilen
     tüm sayıların toplamını veren

        */

        int toplam=0;
        int sayi;

        while(true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("lütfen bir sayı giriniz:");
            sayi=scanner.nextInt();
            if (sayi==0){
                System.out.println("0 sayısını girdiniz. Girilen toplamı hesaplaniyor...");
                break;
            }
            toplam+=sayi;
        }
        System.out.println("sayiların toplamı="+toplam);
        }

    }

