package week03.constructor;

public class Main {
    private String name;

    Main() {
        System.out.println("Constructor Called...");
  //      name = "Constructor name field";

    }

    public static void main(String[] args) {
        Main obj = new Main();
        Main obj2= new Main();
      //  obj.name="Constructor name field";
        // obj.2name="Constructor name field";
        System.out.println("The name is:" + obj.name+"\nThe second name is:"+obj.name);

        NoArgsConstructor noArgsConstructor=new NoArgsConstructor();

    }
}
