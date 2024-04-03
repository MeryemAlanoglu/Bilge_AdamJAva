package week04.map;

import week04.interfaceexamples.ornek02.Language;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {
        HashMap<Integer, String> LanguageHashMap = new HashMap<>();
        LanguageHashMap.put(1, "Java");
        LanguageHashMap.put(2, "Phyton");
        LanguageHashMap.put(3, "C");
        LanguageHashMap.put(4,"Java");
        System.out.println("Hashmap :" + LanguageHashMap);


        //Belirli bir k ye denk gelen value döndürür
        String value = LanguageHashMap.get(2);
        System.out.println("Value at key 2:" + value);

        //keyleri bir set olarak dönme ->keySet();
        System.out.println("Key : " + LanguageHashMap.keySet());

        //vaueları bir set olarak dönmek -> values()
        System.out.println("Values:" + LanguageHashMap.values());

        //key/vaules pair(çift)'ini bir set olarak döner
        System.out.println("Key/Value mappings:" + LanguageHashMap.entrySet());

        // key varsa valeu sunu dön yoksa defaultta "Not found" dön
        //-> burda key var dolayısıyla value döner
        String value1 = LanguageHashMap.getOrDefault(1, "Not Found");
        System.out.println("Value for key: 1" + value1);

        String value2 = LanguageHashMap.getOrDefault(5, "not found");
        System.out.println("Value for key 5" + value2);
        //-> burda key yok dolayısıyla not found döner

        //Bir key var mı diye kontrol eder
        if (LanguageHashMap.containsKey(2)) {
            System.out.println("Map countains key value of: 2");
        } else {
            System.out.println("Key not found");
        }
            //bir vaule var mı diye kontrol eder
            if (LanguageHashMap.containsKey("Java")) {
                System.out.println("Key contains value of java ");

            } else {
                System.out.println("No such value");
            }
        //Bir key ile ilişkili value yu değiştirmek()
            System.out.println("Original HashMap:"+ LanguageHashMap);

            LanguageHashMap.replace(4,"Swift");
            System.out.println(" HashMap after replace():"+ LanguageHashMap);

          //Bütün value değerlerini upperCase'e çevirmek
        LanguageHashMap.replaceAll((K,V)-> V.toUpperCase());
        System.out.println("Updated hashMAp:"+LanguageHashMap);

        //Bir HashMap den öğeleri kaldırmak/silmek (remove())
        String vaule3= LanguageHashMap.remove(4);
        System.out.println("Remove value:"+ vaule3);
        System.out.println("Update HashMap:"+LanguageHashMap);

        //Bir hashmap den bir key/ vaule çiftinin kaldırmak/silmek(remove(K,V))
        Boolean isDeleted =LanguageHashMap.remove(3,"C");
        System.out.println("is deleted:"+ isDeleted);
        System.out.println("Update HashMaph:"+LanguageHashMap);

    }
}
