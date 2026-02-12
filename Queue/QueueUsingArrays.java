package Queue;

public class QueueUsingArrays {
    static class Queue{
        static int arr[];
        static int rear =-1;
        static int front =-1;
        static int size;
        
        Queue(int n){
            arr = new int[n];
            size = n;
        }

        static void enqueue(int data){
            if(rear == size-1){
                return;
            }
            if(front ==-1){
               front = 0;    
            }
            arr[++rear] = data;
        }
        static void dequeue(){
            if(front==rear){
                return;
            }
            front++;
        }
        static int peek(){
            if(front==rear){
                return -1;
            }
            return arr[front];

        }
        static void display(){
            if(front==rear){
                return;
            }
            for(int i =front;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
    }

    
    public static void main(String args[]){
        Queue q = new Queue(10);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.dequeue();
        q.dequeue();
        q.display();        
    }
}
