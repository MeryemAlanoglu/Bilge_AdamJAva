package week03.arrays;

import java.util.Scanner;

public class ScannerNexLineProblem {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("lütfen yasınızı giriniz:");
        int age = scanner.nextInt();//scanner.nextInt()+"\n";
        scanner.nextLine();  //bu metod sayesinde yutmuyor.

        System.out.print("Lutfen adinizi giriniz:");
        String name=scanner.nextLine();

        System.out.println(age+" "+name);
        System.out.println("lütfen yasınızı giriniz: ");
        int age2=Integer. parseInt(scanner.nextLine()); //scanner.nextInt()+"\n";
        System.out.println(age2);

    }
}
