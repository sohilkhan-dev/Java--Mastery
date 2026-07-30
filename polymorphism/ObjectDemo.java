package polymorphism;

// Student class automatically extends Object class
class Student {

    String name;

    // Constructor
    Student(String name) {
        this.name = name;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Student Name: " + name;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.name.equals(s.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class ObjectDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Sohil");
        Student s2 = new Student("Sohil");

        System.out.println(s1);                    // Calls toString()
        System.out.println(s1.equals(s2));         // Compare objects
        System.out.println(s1.hashCode());         // Hash code
        System.out.println(s1.getClass());         // Class name
    }
}