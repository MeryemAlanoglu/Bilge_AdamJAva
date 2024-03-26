package week03.exception;

public class UncheckedException {
    //->Runtime hataları yan çalışma zamanında gerçekleşen hatalar.

    public static void main(String[] args) {
        String name = null;

 // KÖTÜ YAKLAŞIM!!
        //     try{
//            if (name.equals(("meryem")){
 //               System.out.println("name:meryem");
   //         }
     //   }catch (NullPointerException e){
 //           System.out.println("catch!");
       // }

//   EH İŞTE FENA DEĞİL!!
//  if (name !=null && name.equals("meryem")) {
//  System.out.println("name : meryem");
//      }


//   MÜKKEMMEL YÖNTEM!!
      if ("alperen".equals(name)){
          System.out.println("name : alperen");
      }
    }
}
// null değerler sadece objelere verilebilir.