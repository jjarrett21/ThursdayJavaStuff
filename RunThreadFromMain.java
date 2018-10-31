public class RunThreadFromMain implements Runnable {
    
    static Thread thread;

    public void run() {

    }

    public static void main(String[] args) {
        thread = new Thread(new RunThreadFromMain());
        thread.start();
        System.out.println(thread);

        
    }
}