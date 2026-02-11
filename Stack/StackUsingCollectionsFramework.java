package Stack;
import java.util.*;

public class StackUsingCollectionsFramework {
    public static void main(String args[]){
        
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(2);
        s.push(1);
        s.push(5);

        System.out.println("Stack: " + s);

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        System.out.println("Top element: " + s.peek());

        System.out.println("Final Stack: " + s);
    }
}
