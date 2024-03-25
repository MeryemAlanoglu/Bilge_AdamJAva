package week03.methods.staticmethods;

public class StaticVsNonStatic {
    public static void main(String[] args) {
        /*
        static bir metodun içerisinde non-static değer doğrudan çağırılamaz,
        çağırmak için önce metodun bulunduğu sınıfın bir nesnesini oluşturmamız gerekir.

         */

    }
    public int addNumbers1(int a, int b){ //non-static method
        int sum= a+b;
        return  a+b;
    }
    public static int addNumbers2(int a,int b){
        return a+b;
    }
}

