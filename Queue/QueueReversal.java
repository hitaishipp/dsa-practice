package Queue;
import java.util.*;

public class QueueReversal {

    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();

        // Step 1: Move queue → stack
        while(!q.isEmpty()){
            st.push(q.remove());
        }

        // Step 2: Move stack → queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
