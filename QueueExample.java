// Java Program to demo working of Queue interface in Java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements to queue
        for(int i=0; i<5; i++)
            q.add(i);

            //Display the contents of the queue
            System.out.println("Elements of the Queue: " + q);

            // TO remove the head of the Queue
            int remove = q.remove();
            System.out.println("Removed element: " + remove);
            System.out.println("New Queue: " + q);

            // TO view the head of the Queue
            int head = q.peek();
            System.out.println("Head of queue: " + head);

            //Rest all methods of collections 
            // Like size and contains can be used with this implementation 
            int size = q.size();
            System.out.println("Size of queue: " + size);
    }
}