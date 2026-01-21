package LinkedList;

public class LLAdditionOfElement {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
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
    public static void addLast(int data){        //Add at last
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){       //delete a Node
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
    public static void addAtIndex(int data, int pos){
        Node newNode = new Node(data);
        Node temp = head;
        if(pos==0){
            newNode.next = head;
            head = newNode;
            return;

        }
        
        for(int i =0;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode; 
        if(newNode.next==null){
            tail=newNode;
        }
    }
    public static void main(String args[]){
        
        addFirst(6);
        addLast(7);
        
        addFirst(9);
        addFirst(9);
        addAtIndex(8, 3);
        print();
    }

}
