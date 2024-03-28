package week03.constructor;
/*
Ad soyad,yaş ve cinsiyet fieldlarını belirleyelim.
Sonrasında bu sınıfın 2 adet nesnesini oluşturalım bu nesnelerin yaş ve cinsiyet değerleri,
constructor parametresinden,oluşturma anında verilsin.Diğer 2 değeri elle girelim
 */
public class ParameterizedConstructor {
    String name;
    String lastname;
    int age;
    String gender;
    public ParameterizedConstructor(int age, String gender){
          this.age=age; //isim çakışması olacağı için "this" anahtar kelimesini kullanarak sınıfımın field'ı
        // olan age'e erişeceğimi belirtiyorum.
          this.gender=gender;

    }

public static void main(String[] args) {
    ParameterizedConstructor obj1= new ParameterizedConstructor(25,"kadın");
    obj1.name="meryem";
    obj1.lastname="alanoglu";
    ParameterizedConstructor obj2= new ParameterizedConstructor(25,"kadın");
    obj2.name="Meryem";
    obj2.lastname="Alanoğlu";
    System.out.println("Kişinin adı :" + obj1.name);
    System.out.println("Kişinin soyadı:" + obj1.lastname);
    System.out.println(obj1.gender+" " + obj1.gender);

}
}
