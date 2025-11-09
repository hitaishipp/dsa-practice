import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
    public static Integer[] sort(Integer arr[]){
        Arrays.sort(arr,Collections.reverseOrder());
        return arr;
    }
    public static void main(String args[]){
        Integer arr[]= {1,5,4,2,7,9,-2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            
        }
    }
}
