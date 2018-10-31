// Thread Creation by extending the Thread Class

class MultiThreadDemo extends Thread {
    public void run() {
        try {
            // Display the current running thread
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}


public class MultiThread {
    public static void main(String[] args) {
        // Number of Threads
        int n = 8;
        for(int i=0; i<n; i++) {
            MultiThreadDemo demo = new MultiThreadDemo();
            demo.start();
        }
    }
}
 

