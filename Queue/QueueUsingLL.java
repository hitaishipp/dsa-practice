package Queue;

public class QueueUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
         Node front = null;
         Node rear = null;
        public void enqueue(int data){
            Node newNode = new Node(data);
            if(front == null){
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
        public void dequeue(){
            if(front == null){
                return;
            }
            if(front ==rear){
                System.out.println("Only one element left to delete");
                front = rear = null;
                return;
            }
            front = front.next;
        }
        public int peek(){
            if(front == null){
                return -1;
            }
            return front.data;
        }
        public void display(){
            if(front == null){
                return;
            }
            Node temp= front;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]){
        
        Queue q = new Queue();
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
