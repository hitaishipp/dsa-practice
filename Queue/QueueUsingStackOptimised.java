package Queue;
import java.util.*;

public class QueueUsingStackOptimised {

    static Stack<Integer> input = new Stack<>();
    static Stack<Integer> output = new Stack<>();

    static void enqueue(int x){
        input.push(x);
    }

    static int dequeue(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }

        if(output.isEmpty()) return -1;

        return output.pop();
    }

    static int peek(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }

        if(output.isEmpty()) return -1;

        return output.peek();
    }

    public static void main(String[] args){
        enqueue(1);
        enqueue(2);
        enqueue(3);

        System.out.println(dequeue()); // 1
        System.out.println(peek());    // 2
    }
}
