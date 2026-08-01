package exception;
class A{
    public void show() throws ArithmeticException{
        int a=10/0;
    }
}

public class DuckingException {
    public static void main(String[]args){
        A obj = new A();
        try{
            obj.show();
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException caught");
            e.printStackTrace();
        }
    }
    
}
