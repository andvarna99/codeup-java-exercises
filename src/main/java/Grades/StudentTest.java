package Grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student Andrea = new Student("Andrea",new ArrayList<>());
        Andrea.addGrade(100);
        Andrea.addGrade(99);
        Andrea.addGrade(95);
        Student Micah = new Student("Micah",new ArrayList<>());
        Micah.addGrade(93);
        Micah.addGrade(99);
        Micah.addGrade(100);
        Student Emi = new Student("Emi",new ArrayList<>());
        Emi.addGrade(100);
        Emi.addGrade(80);
        Emi.addGrade(95);
        Student Matt = new Student("Micah",new ArrayList<>());
        Matt.addGrade(99);
        Matt.addGrade(90);
        Matt.addGrade(88);
        System.out.println(Andrea.getGradeAverage());
        System.out.println(Micah.getGradeAverage());
        System.out.println(Emi.getGradeAverage());
        System.out.println(Matt.getGradeAverage());
    }
}
