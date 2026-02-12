package Queue;
import java.util.*;

class StackUsingTwoQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {

        q2.add(x);

        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if(q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    public int peek() {
        if(q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueue st = new StackUsingTwoQueue();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.peek());  

        System.out.println("Popped: " + st.pop());       
        System.out.println("Popped: " + st.pop());        

        st.push(40);

        System.out.println("Top element: " + st.peek());  // 40

        while(!st.isEmpty()) {
            System.out.println("Popped: " + st.pop());
        }
    }
}
