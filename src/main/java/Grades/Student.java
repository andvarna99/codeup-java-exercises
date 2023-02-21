package Grades;

import java.util.ArrayList;

public class Student {
    private final String name;
    private final ArrayList <Integer> grades;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double averageGrade = 0;
        for (Integer grade : grades) {
            averageGrade += grade;
        }
        averageGrade /= grades.size();
        return averageGrade;
    }

}
