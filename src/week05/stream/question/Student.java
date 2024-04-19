package week05.stream.question;

import java.util.List;

public class Student {

    private static Double amount;
    private String name;
    private String surname;
    private Integer grade;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.grade = Integer.valueOf((int)(Math.random()*100));

    }

    public static List<Student> generateStudents(int i) {
        return null;
    }

    public static Double calculateAverageGrade(Object studentList) {
        return amount ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}

