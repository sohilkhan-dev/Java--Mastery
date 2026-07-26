package Static;

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}

public class StaticVariable {
    public static void main(String[]args){

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 20000;
        Mobile.name = "Galaxy";

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 80000;
        Mobile.name = "Iphone";

        
        Mobile.name="Iphone 14";

        m1.show();
        m2.show();
        
       

    }

    
}
