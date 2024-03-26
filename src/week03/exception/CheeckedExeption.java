package week03.exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheeckedExeption {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
        }catch (IOException e){
            System.out.println("Veri transferlerinde bir sorun oluştu.");
        }
    }
    public void throwsExample() throws IOException{
        FileWriter fw= new FileWriter("file.txt");
    }
}
