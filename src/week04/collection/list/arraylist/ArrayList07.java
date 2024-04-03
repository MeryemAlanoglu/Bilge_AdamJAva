package week04.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {
    public static void main(String[] args) {


        List<String> firstList = new ArrayList<>();
        firstList.add("Java");
        firstList.add("Phyton");
        List<String> secondList = new ArrayList<>();
        secondList.add("Scala");
        secondList.add("Kotlin");
        List<String> thirdList = new ArrayList<>();
        thirdList.add("ReactJS");

        secondList.addAll(secondList);
        firstList.addAll(firstList);
        System.out.println(thirdList); // bir listedeki değeri başka bir listeye ekledik
    }
}
