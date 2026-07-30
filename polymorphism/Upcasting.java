package polymorphism;

// Parent class
class A {

    public void show() {
        System.out.println("Show method of A");
    }
}

// Child class
class B extends A {

    // Override Parent method
    @Override
    public void show() {
        System.out.println("Show method of B");
    }

    // Child-specific method
    public void display() {
        System.out.println("Display method of B");
    }
}

public class Upcasting {

    public static void main(String[] args) {

        // Upcasting
        A obj = new B();
        obj.show();      // Calls B's show()

        // Downcasting
        B obj1 = (B) obj;
        obj1.display();  // Calls B's display()
    }
}