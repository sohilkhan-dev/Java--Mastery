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

// Anonymous Inner Class
// 1. An inner class without a name.
// 2. Used only once.
// 3. Creates an object and overrides methods at the same time.
// 4. No need to create a separate subclass.

// A obj = new A() {

//     @Override
//     public void show() {
//         System.out.println("in Anonymous Inner Class show");
//     }
// };

// obj.show();
