package Queue;

import java.util.ArrayDeque;

public class QueueUsingDeque {

    static class Queue {
        java.util.Deque<Integer> dq = new ArrayDeque<>();

        void enqueue(int x){
            dq.addLast(x);  // insert at rear
        }

        int dequeue(){
            if(dq.isEmpty()) return -1;
            return dq.removeFirst();  // remove from front
        }

        int peek(){
            if(dq.isEmpty()) return -1;
            return dq.peekFirst();  // check front
        }

        boolean isEmpty(){
            return dq.isEmpty();
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Peek: " + q.peek());     // 10
        System.out.println("Dequeue: " + q.dequeue()); // 10
        System.out.println("Dequeue: " + q.dequeue()); // 20
        System.out.println("Is Empty: " + q.isEmpty());
    }
}
