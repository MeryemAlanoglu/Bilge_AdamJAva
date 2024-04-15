package week05.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample04 {
    public static void main(String[] args) {
        List<String> stringsTemplist= new ArrayList<>();
        stringsTemplist.add("java");
        stringsTemplist.add("alperen");
        stringsTemplist.add("python");
        stringsTemplist.add("ali");
        stringsTemplist.add("hello");
        stringsTemplist.removeIf(str -> str.startsWith("a"));
        stringsTemplist.forEach(System.out::println);

        Predicate<String> predicate1 =String::isEmpty;
//        Predicate<String> predicate2=String::length;
//        Predicate<String> predicate3= String::startsWith;

    }
}
