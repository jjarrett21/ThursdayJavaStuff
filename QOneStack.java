// Java Program to impelement a queue using one stack 

import java.util.Stack;

public class QOneStack {
    // class of queue having two stacks 
    static class Queue {
        Stack<Integer> stack1;
    }

    // Function to push an item to stack 
    static void push(Stack<Integer> top_ref, int new_data) {
        // put in the data
        top_ref.push(new_data);

    }

    // function to pop an item from the stack 
    static int pop(Stack<Integer> top_ref) {
        // If stack is empty the trigger an error
        if(top_ref == null) {
            System.out.println("Stack underflow");
            System.exit(0);
        }
        return top_ref.pop();
    }

    // Function to enqueue an item to queue
    static void enQueue(Queue q, int x) {
        push(q.stack1, x);
    }

    // Function to deQueue an item from queue 
    static int deQueue(Queue q) {
        int x, res = 0;
        if(q.stack1.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }
        else if (q.stack1.size() == 1) {
            return pop(q.stack1);
        } else {
            // pop an item from stack 1
            x = pop(q.stack1);

            // store the las deQueued item 
            res = deQueue(q);

            //Push everything back to stack1
            push(q.stack1, x);
            return res;
        }

        return 0;
    }

    // Driver function to test above function
    public static void main(String[] args) {
        // Create a queue with items 1 2 3 
        Queue q = new Queue();
        q.stack1 = new Stack<>();

        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);

        // Dequeue items 
        System.out.println(deQueue(q) + " ");
        System.out.println(deQueue(q) + " ");
        System.out.println(deQueue(q) + " ");

        
    }
}

