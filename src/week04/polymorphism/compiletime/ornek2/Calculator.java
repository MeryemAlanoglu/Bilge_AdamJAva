package week04.polymorphism.compiletime.ornek2;

public class Calculator {
    /*
    -Bir calculator class ı oluşturun
    -içine sum methodları overloaded yapılmış olsun
    -Bu Calculator class'ının sum methodlarının başka bir class'dan(main)'den çağırınız.
     */

    int sum(int a,int b){
        return a+b;
    }
   double sum(double a, double b){
        return a+b;
    }
    double sum(double a, double b, double c){
        return a+b+c;
    }
    double sum (double a,double b,double c,double d){
        return a+b+c+d;
    }


}

