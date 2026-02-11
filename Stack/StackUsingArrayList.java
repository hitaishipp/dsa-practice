package Stack;
import java.util.*;

public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
        public static void display(){
            for(int i=list.size()-1;i>=0;i--){
                System.out.println(list.get(i));
            }
        }
    }
    public static void main(String args[]){
        
        Stack.push(1);
        Stack.push(2);
        Stack.pop();
        System.out.println(Stack.peek());
        Stack.display();
    }
}
