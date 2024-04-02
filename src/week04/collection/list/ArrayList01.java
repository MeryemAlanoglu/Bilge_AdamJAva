package week04.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //ArrayList sınıfını kullanarak bir list ürettijk
        List<Integer> numberList= new ArrayList<>();
        //Listemize elemanlar ekledik
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println("List:"+ numberList);
        int number=numberList.get(2);// auto unboxing
        System.out.println("Accessed element :" +number);

        //listeden bir indexin kaldırılması
        int removedNumber =numberList.remove(1);
        System.out.println("Removed element:"+ removedNumber);
        System.out.println("List :" + numberList);
    }
}
