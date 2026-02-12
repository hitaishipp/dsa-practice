package Queue;

public class MyDeque {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int daa){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    static class Queue{
        Node front;
        Node rear;

        //Insertion functions

        void addLast(int data){
            Node newNode = new Node(data);
            if(front==null){
                front = rear = newNode;
                return;
            }
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;

        }
        void addFirst(int data){
            Node newNode = new Node(data);
            if(front==null){
                front = rear = newNode;
                return;
            }
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }

        //deletion functions

        void deleteFirst(){
            if(front==null){
                return;
            }
            if(front.next == null){
                rear = front = null;
                return;
            }
            front = front.next;
            front.prev = null;
        }
        void deleteLast(){
           if(front==null){
                return;
            }
            if(front.next == null){
                rear = front = null;
                return;
            }
            rear = rear.prev;
            rear.next = null;
        }

        int peekFront(){
            if(front==null) return -1;
            return front.data;
        }

        int peekBack(){
            if(front==null) return -1;
            return rear.data;
        }
    }
        public static void main(String[] args) {

        Queue dq = new Queue();

        
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);

        
        dq.addFirst(5);
        dq.addFirst(1);

        System.out.println("Front element: " + dq.peekFront()); 
        System.out.println("Rear element: " + dq.peekBack());   

        System.out.println("\nDeleting first...");
        dq.deleteFirst();  

        System.out.println("Deleting last...");
        dq.deleteLast();   

        System.out.println("\nAfter deletions:");
        System.out.println("Front element: " + dq.peekFront()); 
        System.out.println("Rear element: " + dq.peekBack());   

        System.out.println("\nFinal Deque content:");
        
        
        Node temp = dq.front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
