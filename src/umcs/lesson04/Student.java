package umcs.lesson04;

import java.util.Arrays;

/*
 * Exercise 5 — Student
 * ---------------------
 * Represents a student with an array of grades and a method to calculate the average.
 */

public class Student {
    private final int[] grades;

    public Student(int[] grades) {
        this.grades = grades;
    }

    static void main(String[] args) {
        Student s = new Student(new int[]{90, 85, 78, 92});
        System.out.println("Grades: " + Arrays.toString(s.grades));
        System.out.println("Average grade: " + s.average());
    }

    public double average() {
        if (grades.length == 0) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}
