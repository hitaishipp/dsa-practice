package Stack;
import java.util.*;

public class ReverseStringUsingStack {
    static Stack<Character> s = new Stack<>();
    public static String reverse(String st){
        for(int i = 0;i<st.length();i++){
            s.push(st.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            char pop = s.pop();
            sb.append(pop);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str = "hello";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverse(str));
    }
}
