package week04.collection.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {
        //FIFO felsefesiyle çalışır.(first in first out)-> ilk gelen ilk çıkar

        Queue<String> languageQueue =new LinkedList<>();
         //elamanlar ekleyelim
        languageQueue.add("Phyton");
        languageQueue.add("Java");
        languageQueue.add("C");
        System.out.println("LinkedList :"+languageQueue);

        //EN baştaki elemana erişelim
        String str1= languageQueue.peek();//en baştaki elemanı görüntüler
        System.out.println("Accessed Element :"+ str1);

        //en baştaki elemana erişelim aynı zamanda listeden çıkartalım
        String str2=languageQueue.poll();
        System.out.println("Removed element:" + str2);
        System.out.println("LinkedList after poll():"+languageQueue);

        //listelerin sonuna eleman ekleyelim
        languageQueue.offer("Swift");
        System.out.println("LinkedList after offer() :"+ languageQueue );
    }

}
