package week03.garbagecollection;

public class TestGarbage1 {
    public void finalize(){
        System.out.println("object is garbage collected");
    }
    public static void main(String[] args) {
        TestGarbage1 garbage1=new TestGarbage1();
        //Bunlar heapte ayrı yerde tutuluyorlar.
        TestGarbage1 garbage2=new TestGarbage1();


        TestGarbage1 garbage3=new TestGarbage1();
        // bunlar heap te aynı nesneyi referans alıyorlar.
        TestGarbage1 garbage4 =garbage3;

        garbage1=null;
        garbage2=null;
        garbage3=null;
        garbage4=null;//bunun çöpü yoktur çünkü değerini garbage3'den alıyor.
        //yani garbage3 ve garbage4 heap'te aynı değere referanslanmış.

        System.gc();
    }
}
