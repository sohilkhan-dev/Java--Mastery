package Interface;

// Enum is a special data type used to store a fixed set of constant values.

enum Status{
    Running, Failed, Pending,Success;
}

public class EnumDemo {
    public static void main(String[]args){
        System.out.println("hello world");

        Status s = Status.Success;

        // switch for enum

        switch(s){
            case Running:System.out.println("All good ");
            break;

            case Failed: System.out.println("Try again");
            break;

            case Pending:System.out.println("Please Wait");
            break;

            default:System.out.println("Done");
            break;
        }
    }
    
}
