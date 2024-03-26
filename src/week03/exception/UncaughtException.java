package week03.exception;

public class UncaughtException {
    public static void main(String[] args) {


        //UncaughtException uncaughtException=new UncaughtException();
        String name=null;


          //  uncaughtException.method1(name);

    }

    public void method1(String name){
        System.out.println("method1");
               try{
          method2 (name);
       // catch (NullPointerException e){
         System.out.println("NPE");
       } catch (Exception e) {
                   throw new RuntimeException(e);
               }
        System.out.println("method1 didn't work");
    }

    public void method2(String name) {
        System.out.println("method2");
        try {
            method3(name);
        }catch(NullPointerException e){
            System.out.println("NPE");
        }
        name.toUpperCase();
        System.out.println("method2 didn't work!");
    }

    public void method3 (String name) {
        System.out.println("method3");
        try {
            name.toLowerCase();
        }catch(NullPointerException e){
            System.out.println("NPE");
        }
        System.out.println("method3 didn't work!");
    }
}

   // private void method2(String name) {

