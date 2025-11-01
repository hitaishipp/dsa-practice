import java.util.*;
public class maxSubarray{      //brute force method O(n^2)
    public static void maxsub(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int start=0, end=0;
       for(int i=0;i<=arr.length-1;i++){
           int currSum = 0;
          for(int j=i;j<=arr.length-1;j++){
              
              currSum += arr[j];
                
              if(currSum > maxSum){
                  maxSum = currSum;
                  start=i;
                  end=j;
                }
            }
           
          }
       
       System.out.println("the maxSum is "+ maxSum);
       for(int i=start;i<=end;i++){
        System.out.print(arr[i]+" ");
       }
    }

    // public static void maxSub2(int arr[]){
    //      int n = arr.length;
    //     int maxSum = Integer.MIN_VALUE;

    //     for (int i = 0; i < n; i++) {
    //         int currentSum = 0;

    //         for (int j = i; j < n; j++) {
    //             currentSum += arr[j]; 
    //             if (currentSum > maxSum) {
    //                 maxSum = currentSum;
    //             }
    //         }
    //     }

    //     return maxSum;
    // }
    public static void main(String args[]){
        int arr[]= {2,3,-4,5,-1,2,-3,4,-2,6,-5,2};
        maxsub(arr);
    }
}