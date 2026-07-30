package polymorphism;

// Final class (cannot be inherited)
final class Student {

    void display() {
        System.out.println("I am a Student.");
    }
}

class Animal {

    // Final method (cannot be overridden)
    final void sound() {
        System.out.println("Animal makes a sound.");
    }
}

public class FinalKeyword {

    public static void main(String[] args) {

        // Final variable (value cannot be changed)
        final int AGE = 20;
        System.out.println("Age = " + AGE);

        // AGE = 25;   // Error: Cannot change final variable

        // Calling final method
        Animal obj = new Animal();
        obj.sound();

        // Calling final class method
        Student s = new Student();
        s.display();

        // class Dog extends Student { } // Error: Cannot extend final class
    }
}