import java.io.DataOutput;

class RunnableThread implements Runnable {

    Thread thread; 
    public RunnableThread() {
    }
        public RunnableThread(String threadName) {
            // Create a new Thread
            thread = new Thread(this, threadName);

            System.out.println(thread.getName());
            thread.start(); // Start the thread
        }
        public void run() {
            // Print info aobut this thread
            System.out.println(Thread.currentThread());
        }
    }

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableThread(), "thread1");
        Thread thread2 = new Thread(new RunnableThread(), "thread2");
        RunnableThread thread3 = new RunnableThread("thread3");

        //Start Threads
        thread1.start();
        thread2.start();
        try {
            // delay
            Thread.currentThread().sleep(1000);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println(Thread.currentThread());
    }
}




6