package LinkedList;

public class RemoveNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
        
    }
    public static Node head;

    public static void search(int pos){
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;
        for(int i=0;i<pos && fast!=null;i++){
            fast=fast.next;
        }
        if(fast==null){
            return ;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next = slow.next.next;
        head = dummy.next;
    }
}
