package Stack;
import java.util.*;

public class NextGreaterElement {
    public static void checker(int arr[], int res[]){
        Stack <Integer> st = new Stack<>();

        for(int i = arr.length-1; i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }

            if(!st.isEmpty()){
                res[i]=st.peek();
            }
            
            else{
                res[i]=-1;
            }
            st.push(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]= {1,3,2,1,5,8,3};
        int res[] = new int[arr.length];
        checker( arr,  res);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
}
