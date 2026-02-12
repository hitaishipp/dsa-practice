package Queue;

import java.util.*;

public class StackUsingDeque {

    static class Stack {
        Deque<Integer> dq = new ArrayDeque<>();

        void push(int x){
            dq.addLast(x);
        }

        int pop(){
            if(dq.isEmpty()) return -1;
            return dq.removeLast();
        }

        int peek(){
            if(dq.isEmpty()) return -1;
            return dq.peekLast();
        }

        boolean isEmpty(){
            return dq.isEmpty();
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek()); // 30
        System.out.println(s.pop());  // 30
        System.out.println(s.pop());  // 20
    }
}

