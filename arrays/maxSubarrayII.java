import java.util.*;
public class maxSubarray{      //prefix sum method O(n^2)
    public static void maxsub(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int arr1[]= new int[arr.length];
        arr1[0]=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            arr1[i]=arr1[i-1]+arr[i];
        }
        
       for(int i=0;i<=arr.length-1;i++){
          for(int j=i;j<=arr.length-1;j++){
                int currSum = i==0?arr1[j]: arr1[j]-arr1[i-1];
                if(currSum > maxSum){
                    maxSum = currSum;
            }
         
          }
       }
       System.out.println("the maxSum is "+ maxSum);
       
    }
    public static void main(String args[]){
        int arr[]= {2,2,-4,5,-1,2,-3,3,-2,6,5,2};
        maxsub(arr);
    }
}