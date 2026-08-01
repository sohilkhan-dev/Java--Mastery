package exception;

// Custom Exception Class
class InvalidPinException extends Exception {

    // Constructor
    public InvalidPinException(String message) {
        super(message);
    }
}

public class CustomException {

    // Method to check PIN
    static void checkPin(int pin) throws InvalidPinException {

        if (pin != 1234) {
            // Throw custom exception
            throw new InvalidPinException("Invalid ATM PIN");
        }

        System.out.println("PIN Accepted");
    }

    public static void main(String[] args) {

        try {
            checkPin(1111);   // Change to 1234 for valid output
        } catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        }

    }
}
