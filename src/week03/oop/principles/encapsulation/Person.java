package week03.oop.principles.encapsulation;

public class Person {
    private String name;
    private String lastname;
    private int age;

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    private String tcKimlik;

    //Constructor
    //userDefinedMethods
    //getter-setter methods
    //toString method

    private  String arabaSur(){
        if (age>=18){
            return name+"arabayı suruyor.";
        }else {
            return "Araba surmeye yaşınız tutmuyor";
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Yaş 0'dan az olamaz.");
        }else if(age<=18){
            System.out.println("Ehliyet almak için yaşınız tutmuyor");
        this.age = age;
    }else {
            System.out.println("Tebrikler! Ehliyetizi aldınız!"+ arabaSur());
            this.age = age;

        }
}
    }

