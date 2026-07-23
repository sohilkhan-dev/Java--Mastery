package operators;

public class Logical {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println(x > 5 && y < 10); // Logical AND
        System.out.println(x > 5 || y < 10); // Logical OR
        System.out.println(!(x > 5 && y < 10)); // Logical NOT
    }

    
}
