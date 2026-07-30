package polymorphism;

abstract class Car{
    public abstract void drive();
    public abstract void flying();

    public void playMusic(){
        System.out.println("Playing music");

    }
}
class BMW extends Car{
    @Override
    public void drive(){
        System.out.println("driving...");
    }

    @Override
    public void flying(){
        System.out.println("flying...");
    }
}


public class AbstractKeyword {
    public static void main(String[]args){

        Car car= new BMW();
        car.drive();
        car.flying();
        car.playMusic();

    }
    
}
