 package thread;

class A extends Thread {

    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(i + " Hii's");

            try {
                // Pause thread for 100 milliseconds
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {

    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(i + " Hello's");

            try {
                // Pause thread for 100 milliseconds
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadPriority {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        // Start both threads
        a.start();
        try{
            // Pause main thread for 100 milliseconds
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        b.start();
    }
}
 
 
 
 
 
 
 
 
 
 // package thread;

// public class ThreadPriority {
//     public static void main(String[]args){
        
//         Thread t1 = new Thread(){
//             public void run(){
//                 for(int i=0;i<5;i++){
//                     System.out.println("Thread 1");
//                 }
//             }
//         };

//         Thread t2 = new Thread(){
//             public void run(){
//                 for(int i=0;i<5;i++){
//                     System.out.println("Thread 2");
//                 }
//             }
//         };

//         t1.setPriority(Thread.MIN_PRIORITY);
//         t2.setPriority(Thread.MAX_PRIORITY);

//         t1.start();
//         t2.start();
//     }
    
// }
