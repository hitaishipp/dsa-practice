package LinkedList;

public class SwapNodesInLinkedList {
    
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node head;

    public static void add(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    public static Node swapNodes(Node head, int k) {

        Node slow = head;
        Node fast = head;

        int i = 1;
        while (i < k && fast!=null) {
            fast = fast.next;
            i++;
        }
        if (fast == null) return head;

        Node a = fast;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        int temp = a.val;
        a.val = slow.val;
        slow.val = temp;

        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        add(1);
        add(2);
        add(3);
        add(4);
        add(5);

        System.out.println("Before Swap:");
        print(head);

        head = swapNodes(head, 2);

        System.out.println("After Swap:");
        print(head);
    }
}
