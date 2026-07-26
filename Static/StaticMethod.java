package Static;

public class StaticMethod {

    // Static variables (shared by everyone)
    static String bankName = "State Bank of India";
    static String customerCare = "1800-123-456";

    // Non-static variables (different for every customer)
    String customerName;
    int accountNumber;
    double balance;

    // Constructor
    StaticMethod(String customerName, int accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Non-static method
    void displayCustomerDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : ₹" + balance);
        System.out.println();
    }

    // Static method
    static void displayBankDetails() {
        System.out.println("Bank Name     : " + bankName);
        System.out.println("Customer Care : " + customerCare);
        System.out.println();
    }

    public static void main(String[] args) {

        // Calling static method
        displayBankDetails();

        // Creating customers
        StaticMethod customer1 =
                new StaticMethod("Sohil", 101, 25000);

        StaticMethod customer2 =
                new StaticMethod("Rahul", 102, 50000);

        // Calling non-static method
        customer1.displayCustomerDetails();
        customer2.displayCustomerDetails();
    }
}

//  small example 

// public class StaticMethod {

//     // Static method
//     static void welcome() {
//         System.out.println("Welcome to Java Programming!");
//     }

//     public static void main(String[] args) {

//         // Calling static method
//         welcome();

//         System.out.println("Program Started...");
//     }

// }