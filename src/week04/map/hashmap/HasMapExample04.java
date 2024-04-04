package week04.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample04 {
    public static void main(String[] args) {
        HashMap<Integer, String> LanguageHashMap = new HashMap<>();
        LanguageHashMap.put(1, "Java");
        LanguageHashMap.put(2, "Phyton");
        LanguageHashMap.put(3, "C");
        LanguageHashMap.put(4, "Java");
        System.out.println("Hashmap :" + LanguageHashMap);

        //Anahtarlar üzerinden iterasyon
        System.out.println("Iteration through keys ");
        for (Integer key : LanguageHashMap.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        //Değerler üzerinden iterasyon
        System.out.println("Iteration through values ");
        for (String value : LanguageHashMap.values()) {
            System.out.print(value);
            System.out.print(", ");
        }
        //anahtar/değer çifti üzerinden iteresyon
        System.out.println("Iteration through key/value pairs");
        for (Map.Entry<Integer, String> entry : LanguageHashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
