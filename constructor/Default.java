package constructor;

public class Default {

    String name;
    int age;

    // Default Constructor
    Default() {
        name = "Sohil";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Object creation
        Default obj = new Default();

        // Calling method
        obj.display();
    }
}