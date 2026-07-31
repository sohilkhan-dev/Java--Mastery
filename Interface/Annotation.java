package Interface;

class A{
    public void showTheDataWhichBelongsToTheClass(){
        System.out.println("in A show");
    }
}

class B extends A{

    @Override // annotation 
    public void showTheDataWhichBelongsToTheClass(){
        System.out.println("in B show");
    }

}

public class Annotation {

    public static void main(String[] args){

        B obj = new B();
        obj.showTheDataWhichBelongsToTheClass();

    }
    
}
