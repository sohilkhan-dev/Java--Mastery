package Interface;

// class to class -> extends
// class to interface -> implements
// interface to interface -> extends

interface A{

    int age=20;
    String name="Rohit";
    void show();
    void config();
}


interface x{
    void run();
}


class B implements A,x{
    public void show(){
        System.out.println("in show");

    }

    public void config(){
        System.out.println("in config");
    }

    public void run(){
        System.out.println("running");
    }

}

public class Example {
    public static void main(String[]args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        x obj1 = new B();
        obj1.run();

        System.out.println("Name:" + obj.name  + " Age: " + obj.age);


    }
    
}

// Interface = Contract

// Need of Interface:
// 1. Achieve abstraction.
// 2. Support multiple inheritance.
// 3. Define common rules.
// 4. Improve flexibility.
// 5. Reduce dependency between classes.
