package Queue;

public class QueueUsingArrays {
    static class Queue{
         int arr[];
         int rear =-1;
         int front =-1;
         int size;
        
        Queue(int n){
            arr = new int[n];
            size = n;
        }

         void enqueue(int data){
            if(rear == size-1){
                return;
            }
            if(front ==-1){
               front = 0;    
            }
            arr[++rear] = data;
        }
         void dequeue(){
            if(front==-1){
                return;
            }
            if(front==rear){
                front =-1;
                rear = -1;
                return;
            }
            
            front++;
        }
         int peek(){
            if(front==-1){
                return -1;
            }
            return arr[front];

        }
         void display(){
            if(front==-1){
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
