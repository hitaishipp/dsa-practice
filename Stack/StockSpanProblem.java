package Stack;
import java.util.*;

public class StockSpanProblem {

    public static int[] stockSpan(int arr[]) {

        int span[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();   

        for(int i = 0; i < arr.length; i++) {

            
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }

            
            if(s.isEmpty()) {
                span[i] = i + 1;
            } 
            else {
                span[i] = i - s.peek();
            }

            
            s.push(i);
        }

        return span;
    }

    public static void main(String args[]) {

        int arr[] = {100, 80, 60, 70, 75, 40, 85};

        int span[] = stockSpan(arr);

        System.out.println("Stock Prices: " + Arrays.toString(arr));
        System.out.println("Stock Span:   " + Arrays.toString(span));
    }
}
