package week03.fieio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {
    public static void main(String[] args) throws IOException {
        //fileWriter

        FileWriter fileWriter=null;
       try {
            fileWriter = new FileWriter("fileWriter.txt");
            fileWriter.write("merhaba file!");
            fileWriter.write("abc");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("abc");
            fileWriter.write("\r\n");
            fileWriter.write("nextline");
            fileWriter.flush();
        } catch (IOException e) {
           throw new RuntimeException(e);
        }finally {
           if(fileWriter!=null){
               fileWriter.close();
           }
       }
       FileReader fileReader= new FileReader("fileWriter.txt");
       int i;
       while ((i=fileReader.read())!=-1){
            System.out.print((char)i);
        }
       fileReader.close();
    }
}

