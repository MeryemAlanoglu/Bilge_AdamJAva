package week04.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeExample03 {
    public static void main(String[] args) {
        TreeMap<Integer,String> numberMap= new TreeMap<>();
        numberMap.put(3,"three");
        numberMap.put(7,"seven");
        numberMap.put(1,"one");
        numberMap.put(5,"five");
        numberMap.put(9,"nine");
        numberMap.put(8,"eight");

        System.out.println("Before hadMap : "+ numberMap);

        System.out.println("headMap()");
        Map<Integer,String> headMap = numberMap.headMap(7);
        System.out.println("After headMap(7):" + headMap );

        Map<Integer,String> headMapWithBoolean=numberMap.headMap(7,true);
        System.out.println("After headMap(7,true):"+ headMapWithBoolean);

        System.out.println("\n before TailMap:"+ numberMap);
        Map<Integer,String> tailMap = numberMap.tailMap(7);
        System.out.println("After tailMap(7):"+tailMap);
        Map<Integer,String> tailMapWithBoolen = numberMap.tailMap(7,false);
        System.out.println("After tailMap(7,false):"+ tailMapWithBoolen);

        System.out.println("\nBefore SubMap:"+numberMap);
        Map<Integer,String> subMap = numberMap.subMap(3,7);
        System.out.println("After submap(3,7):"+ subMap); //arasındaki değerleri

        Map<Integer,String> subMapWithBoolean = numberMap.subMap(3,false,7,true);
        System.out.println("After submap(3,7,true):" + subMapWithBoolean);

    }
}
