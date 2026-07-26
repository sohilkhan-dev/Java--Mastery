package constructor;

public class AnonymousObject {

    void greet() {
        System.out.println("Welcome to Java!");
    }

    public static void main(String[] args) {

        // Creating an anonymous object
        new AnonymousObject().greet();

    }
}