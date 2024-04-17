package week05.exeptionhandling.trywithresources;

import week05.exeptionhandling.trywithresources.Computer;

import java.util.Arrays;

public class SuppressedExceptionExample01 {
    public static void main(String[] args) {
        try(Computer computer=new Computer()){
            System.out.println("try block!!");
            int number=1/0;//1.exception

        }catch (Exception e){
            System.out.println("Catch block");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getSuppressed()));

        }
    }
}
