//kadane's algorithm
public class maxSubarrayIII{
    public static void kadane(int arr[]){
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        System.out.println("maxSum is: "+maxSum);

    }
    
     //Negative Subarray issue resolved
        public static void kadaneModified(int arr[]){
            int currSum=arr[0];
            int maxSum = arr[0];
            for(int i=1;i<arr.length;i++){
                currSum=Math.max(arr[i],currSum+arr[i]);
                maxSum=Math.max(maxSum,currSum);
            }
            System.out.println("maxSum is "+ maxSum);
        }   
    public static void main(String args[]){
        int arr[]= {2,3,-4,5,-1,2,-3,4,-2,6,-5,2};
          //kadane(arr);
         kadaneModified(arr);

    }
}