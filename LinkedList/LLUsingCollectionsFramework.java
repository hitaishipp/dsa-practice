package LinkedList;
import java.util.LinkedList;

public class LLUsingCollectionsFramework {
    public static void main(String args[]){
        LinkedList <Integer> ll=new LinkedList<>();
        ll.add(4);
        ll.add(5);
        System.out.println(ll);

        System.out.println(ll.get(1));
        ll.addFirst(2);
        ll.addLast(7);
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

       /*  other methods
        ll.getFirst()    
        ll.getLast()
        ll.set(index: 1,value: 99)   -> replaces existing element in the new array
        ll.size()
        ll.isEmpty()
        ll.indexOf()
        ll.contains(10)
        */

    }
}
