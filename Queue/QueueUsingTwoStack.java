package Queue;
import java.util.*;

public class QueueUsingTwoStack {

    public static void enqueue(int data, Stack<Integer> s){
        s.push(data);
    }
    public static int dequeue(Stack<Integer> s, Stack<Integer> st){
        
        if(s.isEmpty()) return -1;
        while(!s.isEmpty()){
            int val = s.pop();
            st.push(val);
        }
        int front = st.pop();
        
        while(!st.isEmpty()){
            int val = st.pop();
            s.push(val);
        }
        return front;
    }
    public static int peek(Stack<Integer> s, Stack<Integer> st){
        if(s.isEmpty()) return -1;
        while(!s.isEmpty()){
            int val = s.pop();
            st.push(val);
        }

        int front = st.peek();
        while(!st.isEmpty()){
            int val = st.pop();
            s.push(val);
        }
        return front;
    }
        public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        Stack<Integer> st = new Stack<>();

        // Enqueue elements
        enqueue(10, s);
        enqueue(20, s);
        enqueue(30, s);
        enqueue(40, s);

        System.out.println("Peek: " + peek(s, st));      // 10
        System.out.println("Dequeue: " + dequeue(s, st)); // 10
        System.out.println("Peek: " + peek(s, st));      // 20
        System.out.println("Dequeue: " + dequeue(s, st)); // 20
        System.out.println("Dequeue: " + dequeue(s, st)); // 30
        System.out.println("Dequeue: " + dequeue(s, st)); // 40
        System.out.println("Dequeue: " + dequeue(s, st)); // -1 (empty case)
    }

}
