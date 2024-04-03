package week04.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

    List<String> animalList=new ArrayList<>();

    animalList.add("fish");
    animalList.add("Cat");
    animalList.add("Dog");
        System.out.println("ArrayList:"+ animalList);
        String str=animalList.get(1);
        System.out.println("Element at index 1 is:"+str);
        int i=0;

        System.out.println("Element at index 0 ise: "+ animalList.get(i));



    }

}
