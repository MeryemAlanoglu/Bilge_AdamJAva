package week05.exeptionhandling.autocloseable;

import java.io.IOException;

public class ExeptionExample01 {
    public static void main(String[] args) {
        try(Computer computer=new Computer()){
            computer.run();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
