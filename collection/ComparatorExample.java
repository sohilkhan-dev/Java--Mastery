package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return marks + " " + name;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(80, "Sohil"));
        students.add(new Student(60, "Rahul"));
        students.add(new Student(90, "Aman"));

        // Sort by marks
        Comparator<Student> byMarks =
                (s1, s2) -> s1.marks - s2.marks;

        Collections.sort(students, byMarks);

        System.out.println(students);
    }
}

