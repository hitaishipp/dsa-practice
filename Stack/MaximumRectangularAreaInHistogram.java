package Stack;
import java.util.*;

public class MaximumRectangularAreaInHistogram {
    public static void helper(int histo[], int nsl[], int nsr[]){
        Stack <Integer> st = new Stack<>();

        //for nsr
        for(int i =histo.length-1;i>=0;i--){
            while(!st.isEmpty() && histo[i]<=histo[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                
                nsr[i]=histo.length;        /*If the next smaller element does not exist,
                                             we assume it lies just outside the array.
                                             So correct boundary is:histo.length*/
            }
            else{
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();

        //for nsl
        for(int i =0;i<histo.length;i++){
            while(!st.isEmpty() && histo[i]<=histo[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                
                nsl[i]=-1;
            }
            else{
                nsl[i] = st.peek();
            }
            st.push(i);
        }
    }
    public static int area(int histo[]){
        int maxArea =0;
        int nsr[] = new int[histo.length];
        int nsl[] = new int[histo.length];
        helper(histo, nsl, nsr);
        for(int i =0;i<histo.length;i++){
            int area= histo[i]*(nsr[i]-nsl[i]-1);

            maxArea=Math.max(area, maxArea);
        }
        
        return maxArea;

    }
    
    public static void main(String args[]){

        int histo[] = {2, 1, 5, 6, 2, 3};

        int result = area(histo);

        System.out.println("Maximum Rectangular Area: " + result);
    }

}
