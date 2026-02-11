package Stack;
import java.util.*;

public class DuplicateParentheses {
    public static int checker(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!=')'){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                int c=0;
                while(!st.isEmpty() && st.peek() != '('){

                    st.pop();
                    c++;
                }
                if(!st.isEmpty()){
                    st.pop();  
                }

                if(c==0){
                    return -1;
                }
            }
        }
        return 1;
    }
    public static void main(String args[]){

    }
}
