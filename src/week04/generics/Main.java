package week04.generics;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> intObj=new GenericClass<>(5);
        System.out.println("Generic class returns :"+intObj.getData());

        GenericClass<String> stringObj=new GenericClass<>("Java programing");
        System.out.println("Generic class returns : " + stringObj.getData());

    }
}
