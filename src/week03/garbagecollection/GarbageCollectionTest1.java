package week03.garbagecollection;

public class GarbageCollectionTest1 {
    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.name="Eşek";

        Animal animal2=new Animal("Eşek");
        System.out.println(animal1.name+" "+animal2.name);
        animal1=null;// Garberge collection tam burda devreye girer
        // ve heep alanından animal objecsini temizler.
        animal2=null;//garbage collector tekrar devreye girdi.
    }
}




