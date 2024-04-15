package week05.diamond_problem;

public interface MyInterface1 {
    public default void defaultMethod(){
        //default ayarlarda metodun acses modifair'ı public olduğu için gri gösteriyor.
        System.out.println("My Interface1 defaoultMethod");
    }

    // Interface de varsayılan olarak bütün methodlar abstracter gelir o yüzden gri görünüyor.
    void test();
}
