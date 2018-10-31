class XThread extends Thread {
    XThread() {
    }
    XThread(String threadName) {
        super(threadName); // Init Thread
        System.out.println(this);
        start();
    }
    public void run() {
        // Info about this thread
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new XThread(), "Thread1" );
        Thread thread2 = new Thread(new XThread(), "Thread2" );

        // Default Named Threads
        Thread thread3 = new XThread();
        Thread thread4 = new XThread();
        Thread thread5 = new XThread("T5");

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
        try {
            Thread.currentThread().sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread());
    }
}
