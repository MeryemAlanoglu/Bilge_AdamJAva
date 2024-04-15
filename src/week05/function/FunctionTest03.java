package week05.function;

import java.util.function.Function;

public class FunctionTest03 {
    /*
    Enscapsulation kurallarına uygun bir employee sınıfı oluşturalım
    her bir Employee'nin ismi ve yaşı olsun
    AllArgs constructor üretelim.

     */

    public static void main(String[] args) {
        Function<Employee,String> employeeStringName=e-> e.getName();
        Employee emp= new Employee("Alperen",28);
        System.out.println(employeeStringName.apply(emp));
    }
}
