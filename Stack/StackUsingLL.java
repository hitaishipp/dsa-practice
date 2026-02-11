package Stack;

public class StackUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    static class Stack{
        static Node top=null; 

        public static void push(int data){
            Node newNode = new Node(data);
            if(top==null){
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }

        public static int pop(){
            
            if(top==null){
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        public static int peek(){
            if(top==null){
                return -1;
            }
            
            int data = top.data;
            return data;
        }

        public static void display(){
            if(top==null){
                return;
            }
            Node temp = top;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("Pushing elements...");
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);

        System.out.println("Stack elements: ");
        Stack.display();

        System.out.println("Top element (peek): " + Stack.peek());

        System.out.println("Popped element: " + Stack.pop());

        System.out.print("Stack after pop: ");
        Stack.display();

        System.out.println("Popped element: " + Stack.pop());
        System.out.println("Popped element: " + Stack.pop());

        System.out.println("Trying to pop from empty stack: " + Stack.pop());
    }
}
