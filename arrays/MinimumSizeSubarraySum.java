public class MinimumSizeSubarraySum {
    public static int maxSubarray(int nums[],int target){
        int min = Integer.MAX_VALUE;
        int currSum=0;
        int left=0;
        int flag=0;
        for(int right=0;right<nums.length;right++){
            currSum+= nums[right];
            while(currSum>=target){
                min = Math.min(min,right-left+1);
                currSum = currSum-nums[left++];  
                flag=1;
            }
            
        }
        if(flag==1){
            return min;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        int target= 7;
        int nums[]={2,3,1,2,4,3};
        System.out.print(maxSubarray(nums,target));
    }
}
