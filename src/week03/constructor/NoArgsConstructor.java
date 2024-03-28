package week03.constructor;
/* Bu sınıfın içerisinde isim, soyisim ve ülke fieldlar olsun. Ülke fieldların içerisinden atayan
    bir parametresiz constructor oluşturalım.
    ülke değeri bir nesne oluşturulamsı durumunda direkt olarak"Türkiye" degerini alsın
    sonrasında bu sınıftın 3 adet nesne üretip isim soyisim blgilerini doldurup ülkelerinin konsol çıktılarını alalım,
     */

public class NoArgsConstructor {
  String name;
  String lastname;
  String country;
 public NoArgsConstructor(){
     country= ": Turkey" ;
 }

    public static void main(String[] args) {
        NoArgsConstructor obj1 = new NoArgsConstructor();
        obj1.name = "Alperen";
        obj1.lastname = "İkinci";
        NoArgsConstructor obj2 = new NoArgsConstructor();
        obj2.name = "Meryem";
        obj2.lastname = "Alanoğlu";
        NoArgsConstructor obj3 = new NoArgsConstructor();
        obj3.name = "Berfin";
        obj3.lastname = "Menteş";

        System.out.println("Kilinin adı :" + obj1.name);
        System.out.println("Kişinin soyadı:" + obj1.lastname);
        System.out.println("Kişinin ülkesi" + obj1.country);
        System.out.println();
        System.out.println("Kilinin adı :" + obj2.name);
        System.out.println("Kişinin soyadı:" + obj2.lastname);
        System.out.println("Kişinin ülkesi" + obj2.country);
        System.out.println();
        System.out.println("Kilinin adı :" + obj3.name);
        System.out.println("Kişinin soyadı:" + obj3.lastname);
        System.out.println("Kişinin ülkesi" + obj3.country);
        System.out.println();

    }
    }
