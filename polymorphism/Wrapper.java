package polymorphism;

public class Wrapper {
    public static void main(String[]args){
        int num=7;
        Integer num1=num; //Autoboxing: converting primitive into object
        
        int num2=num1; //Unboxing: converting object to primitive
        System.out.println(num1+" -> "+num2);

        String str="24";
        int num3=Integer.parseInt(str); //Converting String to int
        System.out.println(num3*num1);
    }
    
}
