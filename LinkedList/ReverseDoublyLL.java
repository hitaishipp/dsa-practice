package LinkedList;

public class ReverseDoublyLL {

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

    public static void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void reverse() {

        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {

            next = curr.next;     // store next
            curr.next = prev;     // reverse next
            curr.prev = next;     // reverse prev

            prev = curr;          // move prev
            curr = next;          // move curr
        }

        tail = head;
        head = prev;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {

        add(10);
        add(20);
        add(30);
        add(40);

        print();

        reverse();

        print();
    }
}
