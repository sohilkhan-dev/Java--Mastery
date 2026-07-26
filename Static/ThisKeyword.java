package Static;

public class ThisKeyword {

    String name;

    public void setName(String name) {

        this.name = name;

    }

    public void display() {

        System.out.println(name);

    }

    public static void main(String[] args) {

        ThisKeyword student = new ThisKeyword();

        student.setName("Sohil");

        student.display();

    }

}