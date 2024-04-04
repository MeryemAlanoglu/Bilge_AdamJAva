package week04.generics;

public class GenericClasTExtendsA <T extends  Number> {
    public void display(){
        System.out.println("This is a bounded type generic class.");
    }
    public static void main(String[] args) {

       // GenericClasTExtendsA<String> strobj=new GenericClasTExtendsA<String>();
      //type argument java.lang.String is not within bounds of type-variable T

        GenericClasTExtendsA<Integer> intobj=new GenericClasTExtendsA<Integer>();

    }
}
