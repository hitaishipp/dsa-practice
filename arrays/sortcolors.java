public class sortcolors {
    public static void sort(int nums[]){
        int low = 0;              // boundary for 0s
        int mid = 0;              // current index
        int high = nums.length - 1; // boundary for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { 
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
    
    }
   for(int i=0;i<nums.length;i++){
     System.out.print(nums[i]);
   }
} 
    public static void main(String args[]){
        int nums[] = {2,0,1,1,2,0,0,2};
        sort(nums);
    }
    
}

