package week05.stream;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourceExample {

    public static void main(String[] args) {


    //Stream source oluşturma.
    Stream<String> stream1=Stream.empty();
    Stream<Integer> stream2= Stream.of(1);
    Stream<Integer> stream3=Stream.of(1,2,3,4,5,6,7);

    //Listi (ya da çoklu veri yapısını) stream e dönüştürebiliriz.

    List<String> list= Arrays.asList("a","b","c");
    Stream<String> formList= list.stream();//artık stream pipelene'ında

    //Generation & ıteration
    //Random saylar oluşturabiliriz,iterasyon yapabiliriz.
    Stream<Double>randoms =Stream.generate(Math::random).limit(5);
    Stream<Integer> oddNumbers= Stream.iterate(1,n-> n+2).limit(5);
    randoms.forEach(System.out::println);
    oddNumbers.forEach(System.out::println);

    //Stream pipeline flow
        Arrays.stream(Object.class.getMethods())//source
                .map(Method::getName)//intermediate operation
                .distinct() //intermediate operetion
                .forEach(System.out::println);//terminal operation

        //range ve rangeClosed
        IntStream.range(1,10).forEach(System.out::println);
        IntStream.rangeClosed(1,5).map(e->e*2).forEach(System.out::println);

        //başlangıç ve bitiş değerlerleri verilerek bir Intstream de oluşturulabilir
        IntStream.iterate(10,i->i+5)
                .limit(6)
                .forEach(System.out::println);



    }
}
