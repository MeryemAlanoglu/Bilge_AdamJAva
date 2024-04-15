package week05.function;


import java.util.function.Function;

public class FunctionTest07 {
    public static void main(String[] args) {

    /*
        metin dizgisini alıp uzunluğunu hesaplayan bir function

        uzunluğu alınan metin dizgisini alıp,uzunluğun karesini hesaplayan bir function

        bu iki function'ı birleştirp bir arada uygulayan function
         */

    Function<String,Integer> stringLength= String :: length;
    Function<Integer,Integer> squareOfLength=n-> n*n;

    Function<String,Integer> combineFunction = stringLength.andThen(squareOfLength);
        System.out.println(combineFunction.apply("Alperen"));
    }






}
