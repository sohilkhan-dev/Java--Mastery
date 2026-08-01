package exception;

// // Exceptions
// # Errors 
// 1.compile time error  - int x = "Hello";   // Compile-time error
// 2.run time error -  Division by zero or Invalid file access
// 3. logical error  - logic error in code 

public class ExceptionHandling {
    public static void main(String[]args){
        // try catch

        int i=0;
        int j=0;

        try{
            j=18/i;
        }
        catch(Exception e){
            System.out.println("something went wrong : " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
    
}
