package week04.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample02 {
    public static void main(String[] args) {
        TreeMap<Integer,String> numberMap= new TreeMap<>();
        numberMap.put(3,"three");
        numberMap.put(7,"seven");
        numberMap.put(1,"one");
        numberMap.put(5,"five");
        numberMap.put(9,"nine");
        numberMap.put(8,"eight");
        System.out.println("Begining: "+ numberMap); // doğal sıralama yapacak

        System.out.println("\n Heigher");
        System.out.println("heigherKey(5)"+ numberMap.higherKey(5));
        System.out.println("heigherEntry(5)"+ numberMap.higherEntry(5));

        System.out.println("\n Lower");
        System.out.println("lowerKey(5) :" + numberMap.lowerKey(5));
        System.out.println("lowerEntry(5) :" + numberMap.lowerKey(5));

        System.out.println("\nCeiling Function");
        System.out.println("ceilingEntry(4):"+numberMap.ceilingEntry(4));
        System.out.println("ceilingKey(4):"+numberMap.ceilingKey(4));
        System.out.println("ceilingEntry(5) :" + numberMap.ceilingEntry(5));

        System.out.println("\n Floor Function");
        System.out.println("floorEntry :" + numberMap.floorEntry(5));
        System.out.println("floorKey :"+numberMap.floorEntry(4));

        System.out.println("\nBefore poll methods :"+ numberMap);
        Map.Entry<Integer,String> removedEntry=numberMap.pollFirstEntry();
        System.out.println("\nAfter pollFirstEntry()"+numberMap);
        System.out.println("Removed Entry :" + removedEntry);

        Map.Entry<Integer,String> removedLastEntry=numberMap.pollFirstEntry();
        System.out.println("\nAfter pollLastEntry()"+numberMap);
        System.out.println("Removed Entry :" + removedLastEntry);
    }
}
