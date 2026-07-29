package Inheritance;

class A {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}


class B extends A {

    @Override
    public int add(int a, int b) {
        return a + b + 1; // Overriding add method
    }
}


public class MethodOverriding {

    public static void main(String[] args) {

        B obj = new B();

        System.out.println(obj.add(5, 3));
        System.out.println(obj.sub(5, 3));

    }
}