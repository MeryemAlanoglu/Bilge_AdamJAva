package week05.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest05 {
    public static void main(String[] args) {
        Function<String,Integer> parseInt= Integer::parseInt;
        Function<Integer,Integer > incerementExact= Math::incrementExact;
        //ikisi de aynı işi yapıyor. ilkinde öbnce parseInt
        //metodu çalıştırıp sonra andThan ile 2. metodu çalıştırıyoruz

        Function<String,Integer> parseIntAndIncerementExact = parseInt.andThen(incerementExact);
        //compose ile yapılması durumundada önce argüman işleniyor.
        // ondan sonra solundaki metot (incerementExact) çalışıyor
        Function<String,Integer> compose = incerementExact.compose(parseInt);

        Stream.of("-3","11","25","30","-1","-11")
                .map(parseIntAndIncerementExact).forEach(System.out::println);
        //map metodu String objelerini Integer objelerine çevirmek için kullanıldı.

        System.out.println("--------");
        //uzun yöntem
        List<String> stringList= Arrays.asList("a a ","b b","c c","d d");
        Function<String, String> upperCase = String::toUpperCase;
        stringList.stream().map(upperCase).forEach(System.out::println);

        //kısa yöntem
        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
