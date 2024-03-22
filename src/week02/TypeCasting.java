package week02;

public class TypeCasting {
    public static void main(String[] args) {
        int dollar =5;
        float dollarf= dollar;
        long dollarl= dollar;
        System.out.println("dollar="+ dollar + "\n"+
                           "dollarf="+ dollarf+"\n"+
                           "dollarl="+ dollarl);

        float floatDollar = 13.5f;
        int intDollar = (int)floatDollar;

        System.out.println("floatDollar="+ intDollar+"\n");

        long LongDollar=2;
        int intDollar2= (int) LongDollar;

        long longValue = 123456789101112L;
        int intValue = (int) longValue;
        System.out.println(longValue);
        System.out.println(intValue);

        float number1=5.3f;
        int sum= (int) (number1+ 5);
        System.out.println(sum);

    }
}
