package thread;

class Bank {
    int balance = 10000;

    void withdraw() {
        balance = balance - 100;
    }
}

public class RaceCondition {
    public static void main(String[] args) {

        Bank b = new Bank();

        // First thread
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                b.withdraw();
            }
        });

        // Second thread
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                b.withdraw();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Balance: " + b.balance);
    }
}

// synchronized is used to prevent race conditions.

// It allows only one thread at a time to access a particular method/block.

// class Bank {

//     int balance = 10000;

//     // Only one thread can use this method at a time
//     synchronized void withdraw() {
//         balance = balance - 1000;
//     }
// }