package week04.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample01 {
    public static void main(String[] args) {

        TreeMap<Integer,String> numberMap= new  TreeMap<>();
        numberMap.put(3,"Three");
        numberMap.put(7,"Seven");
        numberMap.put(1,"one");

        System.out.println("Begining :" + numberMap);

        TreeMap<Integer,String> numberMap2= new  TreeMap<>();
        numberMap2.put(5,"five");
        numberMap2.put(9,"nine");

        System.out.println("Begining :"+ numberMap2);

        numberMap.putAll(numberMap2);
        System.out.println("After putAll() : " + numberMap);

        System.out.println("get(5) : "+ numberMap.get(5));
        System.out.println("keySet() : " + numberMap.keySet()) ;
        System.out.println(("values() : "+numberMap.values()));
        System.out.println("entryset() : "+ numberMap.entrySet());
        System.out.println(("size () : " + numberMap.size()));

        for(Map.Entry<Integer,String>entry: numberMap.entrySet()){
            Integer key= entry.getKey();
            String value= entry.getValue();
            System.out.println(key+"--->"+ value);
        }
        numberMap.putIfAbsent(3,"uc");
        System.out.println("entrySet() after putIfAbsent(3,uc) :"+ numberMap.entrySet());
        numberMap.putIfAbsent(1,"bir");
        System.out.println("entrySet() after putIfAbsent(1,bir) :"+ numberMap.entrySet());


        numberMap.remove(1,"one");
        System.out.println("entrySet() after remove(1,one)"+numberMap.entrySet());

        numberMap.remove(1);
        System.out.println("entrySet() after remove(1)"+numberMap.entrySet());

        Integer firstKey=numberMap.firstKey();
        System.out.println("firstKey:"+firstKey);
        Integer lastKey= numberMap.lastKey();
        System.out.println("lastKey : " + lastKey);

        System.out.println("First Entry: " + numberMap.firstEntry());
        System.out.println("Last Entry : " + numberMap.lastEntry());
    }


}


