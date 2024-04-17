package week05.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;



public class StreamTerminalOperation {
    public static void main(String[] args) {
        //count()-> sonlu bir Stream'deki ögelerin sayısını belirler.
        Stream<String> s2=Stream.of("K1","k2","k3");
        long countElement =s2 .count();
        System.out.println(countElement);

        //min(), max() String veya Arrayin minimum veya naksimum değerlerini bulabiliriz
        Stream<String> stream01= Stream.of("eagle","lion", "racoon");
        Stream<String> stream02= Stream.of("eagle","lion", "racoon");

        Comparator<String> comp =Comparator.comparingInt(String::length);

        Optional<String> min = stream01.min(comp);
        Optional<String> max= stream02.max(comp);
        System.out.println(min);
        System.out.println(max);

        String[] stringArray = "merhaba dünya ben alperen, nasılsın? ".split(" ");
        System.out.println(Arrays.stream(stringArray).min(String::compareTo).get());
        System.out.println(Arrays.stream(stringArray).max(String::compareTo).get());

        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(stringArray).min(lengthCompare).get());


        //findAny() & findFirst()
        //findAny()-> Streamdeki ögelerden birini döndürür; Stream de hiçbir öge yoksa boş bir optional<T> object döndürür

        //findFirst() Streamdeki ilk ögeyi döndürür. Hiçbir öge yoksa Optional <T> nesnesi döndürür
        //findFirst() akışın ilk ögelerini döndürür ancak findAny() akışındaki herhangi bir ögeyi seçmekte özgürdür.(özellikle paralel stream kullandığımızda)

        Stream<String> s =Stream.of("monkey","gorilla","dog");
        Stream<String> infinite=Stream.generate(()->"chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);


        OptionalDouble temperature = DoubleStream.of(-10,1,-5,0,30.0,-7.3,41.2,2.2)
                .filter(temp->temp<0)
                .findFirst();

        OptionalDouble temperature2 = DoubleStream.of(-10,1,-5,0,30.0,-7.3,41.2,2.2)
                .filter(temp->temp<0)
                .findAny();
        System.out.println(temperature);
        System.out.println(temperature2);

        //anyMatch(), allMatch(), noneMatch()
        List<String> list= new ArrayList();//TODO

        Stream<String>infinite1 = Stream.generate(()-> "chimp");
        Stream<String>infinite2 = Stream.generate(()-> "chimp");

        Predicate<String> pred =x -> Character.isLetter(x.charAt(0));

        //anyMAtch (İ:) Streamde verilen predicate ,ile eşleşen herhangi bir öge varsa true değerini döndürür
        //Stream boşsa veya eşleşen öge yoksa false değerini döndürür
        System.out.println(list.stream().allMatch(pred));

        //allMatch() yalnızca Streamdeki tüm ögelerin verilen Predicate ile eşmesi durumunda true değerini
        // Stream boşsa true değerini döndürür
        System.out.println(list.stream().allMatch(pred));

        //nonMatch(), yalnızca Streamdeki ögelerin hiçbiri verilen Predicate ile eşleşmede true değeri stream boşsa true değerini döndürür
        // Sonsuz streamlşer için sonlandırılabilir,sonlandırılabilir(verilere bağlıdır)
        System.out.println(list.stream().noneMatch(pred));

        //infinitive
        System.out.println(infinite1.anyMatch(pred));//true
      //  System.out.println(infinite1.anyMatch(pred)); //true->endless loop

        System.out.println(infinite2.noneMatch(pred));//false

        //forEach() pripeline deki terminal işlemidir.
        Stream<String> s01= Stream.of("Monkey","Gorilla","Chimp");
       // s01.forEach(System.out::println);

        List<String>List01= new ArrayList<>();
        s01.forEach((str)->{
            String sUpper=str.toUpperCase();
            list.add(sUpper);
        });
        System.out.println(list);

        //map() vs foEach()
        //forEach()-> void döner, dolayısıyla içerisinde de void dönen bir işlem olmalı

        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        numbers.forEach(number-> System.out.println(number*2));
        System.out.println(numbers);

        //map
        List<Integer> mappedNumbers=numbers.stream()
                .map(number->number*2)
                .map(number -> number*2)
                .collect(Collectors.toList())
                .stream()
                .map(number->number*2)
                .collect(Collectors.toList());
        System.out.println(mappedNumbers);

        //map 2.yol

        List<Integer> mappedNumbers2=numbers.stream()
                .map(number->number*2)
                .map(number -> number*2)
                .collect(Collectors.toList());
        mappedNumbers2.forEach(System.out::println);
        mappedNumbers2=mappedNumbers2.stream().map(number->number*2).collect(Collectors.toList());

        System.out.println(mappedNumbers2);


        Stream<Integer> stream= Stream.of(3,5,6);
        Stream<Integer> stream2= Stream.of(3,5,6);

        System.out.println(stream.reduce(10,(a,b)->a*b));
        //10,3->10*3->30 a=30
        //30,5->30*5->150 a=150
        //150,6->150*6->900 a=900
        //900,null->girmiyor=>return a
        System.out.println(stream2.reduce((a,b)->a*b));//değer olmazsa diye opsiyonel döndürüyor
        //3,5->3*5=15 a=15
        //15,6->15*6=90 a=90
        //90,null->girmiyor =>return a


    Stream<String> stream3=Stream.of("w1","o2","l3","f4");
    //String word=stream3.reduce("X",(x,y)->x.concat(y));
    String word= stream3.reduce("x",String::concat);
        System.out.println(word);

        Stream<String> stream4=Stream.of("w","o","l","f");
        String word2= String.valueOf(stream4.reduce("",(c,d)->c+"--"+d));
        System.out.println(word2);

        //Collect()
        String frenchCounting= "un: deux:deux:quatre";
//        List<String> gmailList = Arrays.stream(Pattern.compile(":")
//                .split(frenchCounting)).collect(Collectors.toList());
        List<String> gmailList=Pattern.compile(":")
                .splitAsStream(frenchCounting).collect(Collectors.toList());
        System.out.println(gmailList);

        List<String> gmailList2=List.of(frenchCounting.split(":"));
        System.out.println(gmailList2);

        Set<String> gmailSet= Pattern.compile(":")
                .splitAsStream(frenchCounting).collect(Collectors.toSet());
        System.out.println(gmailSet);

        //collect(Collectors.toMap())
        Map<String,Integer> nameLength = Stream.of("Albus","Percival","Mulfric","Brain","Dumbledore")
                .collect(Collectors.toMap(name->name,String::length));
        System.out.println(nameLength);

        Optional<String> name=Stream.of("Albus","Percival","Mulfric","Brain","Dumbledore")
                .reduce(String::concat);

        Map<String,Integer> nameLength2 = Stream.of(name.get())
                .collect(Collectors.toMap(name2-> name2, String::length));
        System.out.println(nameLength2);

        //StringBuilder()
        Stream<String> stream05= Stream.of("w","o","l","f");
        StringBuilder word3= stream05
                .collect(StringBuilder::new
                        //(a,b)
                ,StringBuilder::append // a
                ,StringBuilder::append); //b
        System.out.println(word3);

        Stream<String> stream06 = Stream.of("w","o","l","f");
        TreeSet<String> set= stream06.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);




}
}