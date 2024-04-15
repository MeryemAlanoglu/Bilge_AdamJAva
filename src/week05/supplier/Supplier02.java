package week05.supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Supplier02 {
    public static void main(String[] args) {
        Supplier<Integer> supplier01 = ()-> new Random().nextInt(20);
        Stream.generate(supplier01).limit(5).forEach(System.out::println);

        System.out.println("-------");
        Supplier<Integer> supplier02=new Random()::nextInt;
       Stream.generate(supplier02)
                .limit(6)
                .filter(number->number>5)
                .forEach(System.out::println);

     //  Supplier<Integer> supplier03 = Supplier02::cereateRandomNumber;
        System.out.println();

    }

    public static Integer createRandomNumber(){
        return new Random().nextInt();

    }
}






