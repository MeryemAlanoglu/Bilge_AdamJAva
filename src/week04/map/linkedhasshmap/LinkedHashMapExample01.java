package week04.map.linkedhasshmap;

 import java.util.LinkedHashMap;

public class LinkedHashMapExample01 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> nameMap= new LinkedHashMap<>();
        nameMap.put("book","kitap");
        nameMap.put("application","uygulama");
        nameMap.put("apple","elma");
        nameMap.put(null,null);
        nameMap.put(null,"a");
        nameMap.put("null",null);
        nameMap.put(null,"b"); ;//null a ve null b aynı değerler oluyor b a yı yutuyor.
        System.out.println("LinkedHashMAp :"+ nameMap);

    }
}
