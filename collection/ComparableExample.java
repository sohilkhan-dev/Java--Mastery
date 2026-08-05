package collection;

// Comparable → default sorting → compareTo()

// Comparator → custom sorting → compare()

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    // Sort students by marks
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    public String toString() {
        return marks + " " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(80, "Sohil"));
        students.add(new Student(60, "Rahul"));
        students.add(new Student(90, "Aman"));

        // Sort using Comparable
        Collections.sort(students);

        System.out.println(students);
        

        
    }
}

