package Inheritance;

class A extends Object {  
    // Every class in Java extends Object class by default.

    public A() {
        super(); 
        // Calls parent class constructor (Object).

        System.out.println("in A");
    }

    public A(int n) {
        super();
        // Calls parent constructor first.

        System.out.println("in int A");
    }
}


class B extends A {

    public B() {

        super();
        // Calls parent class (A) constructor.

        System.out.println("in B");
    }


    public B(int n) {

        this();
        // Calls constructor of same class (B).

        // super(n);
        // Calls parent parameterized constructor.
        // Cannot use this() and super() together.

        System.out.println("in int B");
    }
}


public class SuperMethod {

    public static void main(String[]args){

        // B obj = new B();
        // B obj = new B(5);

        B obj = new B(5);

    }
}