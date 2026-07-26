package constructor;

public class Parameterized {

    String name;
    int age;

    // Parameterized Constructor
    Parameterized(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating objects using parameterized constructor
        Parameterized obj1 = new Parameterized("Sohil", 20);
        Parameterized obj2 = new Parameterized("Rahul", 22);

        obj1.display();
        System.out.println();
        obj2.display();
    }
}