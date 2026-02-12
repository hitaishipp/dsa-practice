package Queue;

public class CircularQueueUsingArrays {
    static class Queue{
         int arr[];
         int rear =-1;
         int front =-1;
         int size;
        
        Queue(int n){
            arr = new int[n];
            size = n;
        }
        boolean isEmpty(){
            if(front == -1){
                return true;
            }
            return false;
        }

         void enqueue(int data){
            if((rear + 1) % size == front){
                return;
            }
            if(isEmpty()){
               front = 0;    
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
         void dequeue(){
            if(isEmpty()){
                return;
            }
            if(front==rear){
                front =-1;
                rear = -1;
                return;
            }
            
            front = (front +1)%size;
        }
         int peek(){
            if(front==-1){
                return -1;
            }
            return arr[front];

        }
         void display(){
            if(isEmpty()){
                return;
            }
            int i = front;
            while(true){
                System.out.println(arr[i]);
                if(i==rear){
                    break;
                }
                i = (i +1)%size;
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
