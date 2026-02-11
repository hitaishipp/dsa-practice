package Stack;
import java.util.*;

public class ValidParentheses{
    public static int parenthesesChecker(String s){
    Stack<Character> st = new Stack<>();

    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);

        if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
        } else {
            if(st.isEmpty()) return -1;

            char top = st.pop();

            if((ch==')' && top!='(') ||
               (ch=='}' && top!='{') ||
               (ch==']' && top!='[')){
                return -1;
                }
            }
        }

        return st.isEmpty() ? 1 : -1;
    }

    public static void main(String args[]){
        String s = ")(";
        String sh = "(){}[]";
        String sp = "{()}[]";
        String sk = "{()}]]";
        System.out.println(parenthesesChecker(s));
        System.out.println(parenthesesChecker(sh));
        System.out.println(parenthesesChecker(sp));
        System.out.println(parenthesesChecker(sk));
    }
}