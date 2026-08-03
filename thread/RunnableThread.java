package thread;

public class RunnableThread {
    public static void main(String[] args) {

        // First Runnable
        Runnable r1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + " Hii's");

                try {
                    // Pause thread for 10 milliseconds
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Second Runnable
        Runnable r2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + " Hello's");

                try {
                    // Pause thread for 10 milliseconds
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create two threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Start both threads
        t1.start();
        t2.start();
    }
}