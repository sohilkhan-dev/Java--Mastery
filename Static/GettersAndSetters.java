package Static;

public class GettersAndSetters {

    // Private variables
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        // Creating object
        GettersAndSetters student = new GettersAndSetters();

        // Setting values
        student.setName("Sohil");
        student.setAge(20);

        // Getting values
        System.out.println("Name : " + student.getName());
        System.out.println("Age  : " + student.getAge());

    }

}