package LinkedList;

public class LLloopDetection {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static int detect(){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return 1; // loop detected
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        System.out.println(detect());
    }
}
