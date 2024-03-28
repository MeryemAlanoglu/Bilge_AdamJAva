package week03.constructor;

public class ConstructorOverLoding {
    String country;
    String language;
ConstructorOverLoding(String country, String language){
    this.country=country;
    this.language = language;
}
ConstructorOverLoding(String country){//parametreli Constractor
    this.country= country;

}
ConstructorOverLoding(){ //NoArgsConstractor

}
    public static void main(String[] args) {
       //no-arg cnstructor. şu an herhangi bir constructor
        // tanımlanmadığı için default constructor java tarafından getiriyor
        ConstructorOverLoding obj1=new ConstructorOverLoding();
        obj1.country="Turkey";
        obj1.language="Turkısh";
        System.out.println(obj1.country+" "+obj1.language);
        /*
        1.de NoArgsConstructor kullandık.iki field'ın değerini de nesneyi oluşturduktan sonra,ayrı ayrı atadık.
         */
        ConstructorOverLoding obj2=new ConstructorOverLoding();
        obj2.country="Germany";
        obj2.language="German";
        System.out.println(obj2.country+" "+obj2.language);

        /*
        2. de Parameterized Constructor kullandık. Fieldlarda birinin değerini oluşturuken erguman olarak verdik(country)
        diğerini ise nesneyi oluşturduktan sonra dışarıdan ataması yapılır.

        */
        ConstructorOverLoding obj3=new ConstructorOverLoding("England", "English");
        System.out.println(obj3.country+" "+obj3.language);
        /*
        3.'de bütün fieldları PARAMNTERİZED COUNSTRACTOR ile aldık. Dolayısıyla dışarıdan değer
        ataması yapmam gerek kalmadı.Nesneyi oluştururken içini de doldurdum. AllArgsConstructor.
         */
}

}
