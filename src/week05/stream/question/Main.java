package week05.stream.question;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /**
     * 1-Student sınıfı oluşturalım-> name,surname,grade;
     * 1.1->Encapsulation
     * 2-Main sınıfında girilen sayı kadar students nesnesi üreten bir metot yazalım.
     * (grade kısmı 0-100 aralığında rastgele değer alsın)
     * 3- daha sonra öğrencilerin not ortalamasını hesaplayıp dönen bir stream yazalım
     * 4-Notu 50 den düşük olan öğrencileri liste olark dönen bir stream yazalım
     * 5-öğrencilerin isimlerini ve öğrencilerin notlarını yazdıran bir stream
     */

    public static void main(String[] args) {


        List<Student> studentList= Student.generateStudents(30);
        Double averageGrade =Student.calculateAverageGrade(studentList);
        List<Student> studentsBellowBound =studentList.stream()
                .filter(x-> x.getGrade()<50).collect(Collectors.toList());
        System.out.println(averageGrade);
        System.out.println(studentsBellowBound);
        studentList.forEach(x-> System.out.println(x.getName()+"  "+ x.getGrade()));






        }
    }


