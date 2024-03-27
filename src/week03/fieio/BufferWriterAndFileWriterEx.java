package week03.fieio;

import java.io.*;

public class BufferWriterAndFileWriterEx {
    public BufferWriterAndFileWriterEx()throws FileNotFoundException{

    }
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("buffered.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.write("world");
        bw.newLine();
        bw.write("java");
        bw.close();
        fw.close();

        FileReader fr=new FileReader("buffered.txt");
        BufferedReader br= new BufferedReader(fr);

                String data=null;

        while((data=br.readLine())!=null){
            System.out.println(data);
        }

        fr.close();
        br.close();

        }
    }

    /*
    Meryem derse geldi ve yine uykulu bir sabahın kavgasına tutuldu. Hayatını sorgulayan meryem ne olduğunu
    anlamadı. Dönüp  insanlar "Gız Meryem Meryem yedin bitirdin Meryem Meryem" der iken onun aklı
    sadece uykusundaydı
     */