package week04.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample01 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();   //Map tanimladik.

        HashMap<String, Integer> languageHashmap=new HashMap<>();
        //Eleman ekleyelim
        languageHashmap.put("Java",8);
        languageHashmap.put("Python,",1);
        languageHashmap.put("JavaScript",3);
        System.out.println("HasMap:"+ languageHashmap);
    }
}
