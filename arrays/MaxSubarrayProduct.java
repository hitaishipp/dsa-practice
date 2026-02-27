public class MaxSubarrayProduct {
    public static int product(int nums[]){
           int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            result = Math.max(result, maxProd);
        }

        return result;
    }
    
    public static void main(String args[]){
        int arr[] = {1, 2, -3, 4, 5};
        System.out.println(product(arr));
    }
}
