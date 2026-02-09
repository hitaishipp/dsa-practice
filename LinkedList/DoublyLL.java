package LinkedList;

public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    public static Node head;
    public static Node tail;

    public static void addAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next= head;
        head.prev= newNode;
        head= newNode;
    }
    public static void addAtLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next= newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void addAtIndex(int data, int index){
        Node newNode = new Node(data);
        if(index<0){
            return;
        }
        if(index==0){
            addAtFirst(data);
            return;
        }
        if(head==null){
            return;
        }
        Node temp = head;
        for(int i= 0; i<index-1 && temp !=null; i++){
            temp = temp.next;

        }
        if(temp==null ){
            System.out.println("index out of bound");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
            } 
        else {
            tail = newNode;  
            }

        temp.next = newNode;

    }

    public static void deleteAtFirst(){
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        if (head.next == null) { 
            head = tail = null;
            return;
        }
        head.next.prev = null;
        head = head.next;
    }

    public static void deleteAtLast(){
        if(head == null){
            System.out.println("Nothing to delete");
            return;
        }
        if(head.next==null){
            head = tail = null;
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
    }

    public static void deleteAtIndex(int index){
        if(index<0){
            return;
        }
        if(index == 0){
            deleteAtFirst();
            return;
        }
        Node temp = head;
        for(int i= 0; i<index-1 && temp!=null ; i++){
            temp = temp.next;
        }
        if(temp==null || temp.next==null){
            System.out.println("index out of bounds");
            return;
        }
        if(temp.next.next!=null){
            temp.next = temp.next.next;
            temp.next.prev = temp;
            return;
        }
        temp.next = null;
        tail = temp;

    }
    public static int size(){
        int size =0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static void main(String args[]) {

        addAtFirst(10);
        addAtFirst(5);
        addAtLast(20);
        addAtLast(25);

        addAtIndex(15, 2);

        deleteAtFirst();
        deleteAtLast();
        deleteAtIndex(1);

    }

}
