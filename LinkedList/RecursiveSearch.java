package LinkedList;
import java.util.LinkedList;

public class RecursiveSearch {
    
    public static int recSearch(LinkedList<Integer> ll , int key, int index){
        if(index == ll.size()){                        //we cant use null condition here
            return -1;
        }
        if(ll.get(index)==key){
            return index+1;
        }
        int u = recSearch(ll, key, index+1);
            
        return u;
    }
    public static void main(String args[]){
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        int key = 5;
        System.out.println(recSearch(ll, key, 0) );
        key = 0;
        System.out.println(recSearch(ll, key, 0) );
    }
}
