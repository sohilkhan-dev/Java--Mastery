package polymorphism;

class A{
    int age;
    public void show(){
        System.out.println("in show");
    }

    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class InnerClass {
    public static void main(String [] args){
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        // A.B obj1 = new A.B();// its because if class B is static then we can create object of class B without creating object of class A
        obj1.config();
    }
    
}
