package LinkedList;

public class CheckIfLLisPalindrome {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static boolean palindrome(){
        Node slow = mid();
        Node curr = slow;
        Node next = null;
        Node prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node temp= head;
        Node temp2 = prev;
        while(temp!=slow){
            if(temp.data!=temp2.data){
                return false;
            }  
            temp = temp.next;
            temp2 = temp2.next;  
        }
        return true;
    }

    public static Node mid(){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            
        }
        
        return slow;
    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        if(palindrome()){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");

        }
    }
}
