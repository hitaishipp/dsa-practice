package LinkedList;

public class LLDeletion {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    } 
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){             // Add at first
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode; 
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public static void print(){       //print Nodes
        Node temp = head;
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static int deleteAtFront(){         //delete at front
        if(head==null){
            System.out.println("Nothing to delete");
        }
        int val = head.data;
        head = head.next;
        return val;

    }
    public static void deleteAtEnd(){         //delete at end
        if(head==null){
            System.out.println("Nothing to delete");
        }
        Node temp = head;

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        while(temp.next.next!=null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;

    }

    public static void deleteAtPos(int pos){        //delete at Index
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        if(pos==1){
            deleteAtFront();
            return;
        }
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Index out of bounds");
            return;
        }

        if(temp.next==tail){
            tail = temp;
        }
        temp.next = temp.next.next;

    }
    public static int size(){
        if(head==null){
            System.out.println("Nothing to print");
            return 0;
        }
        Node temp = head;
        int size =0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;

    }
    public static void search(int target){
        if(head == null){
            System.out.println("Nothing to search");
            return;
        }
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(temp.data==target){
                System.out.println("data found at position " + count);
                return;
            }
            temp = temp.next;
        }

    }
    public static void main(String args[]){
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        print();
        deleteAtFront();
        deleteAtEnd();
        deleteAtPos(1);
        print();
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        print();
        System.out.println("The size of the Linked List is " + size());
        search( 4);


    }
}
