package week04.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();
        nameList.add("Java");
        nameList.add("Python");
        nameList.add("C#");

        List<String> nameList2=new ArrayList<>();
       // nameList2.addAll(nameList.of("java,phayton,c#"))
       // nameList2.add(nameList);-> Bu şekilde d elisteye atamalar yaplabilir.
        // Bir listeye başka bir listeyi addAll() yardımıyla aktarılabilir

       //listeden bir elemanı değiştirme
        System.out.println("List before.set:" + nameList);
        nameList.set(1,"scala");
        System.out.println("List after.set:" + nameList);

        //listeden bir elemanını indexle çıkarma(listeden silme)
        System.out.println("List before Remove" + nameList);
        nameList.remove(2);
        System.out.println("List after Remove" + nameList);


        //listeden bir elemanını içeriğiyle çıkarma(listeden silme)
        System.out.println("List before Remove" + nameList);
        nameList.remove("scala");
        System.out.println("List after Remove" + nameList);
    }
}
