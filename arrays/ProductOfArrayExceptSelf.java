public class ProductOfArrayExceptSelf {
    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Step 1: prefix products
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // Step 2: multiply by suffix products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * right;
            right = right * nums[i];
        }
        
        return output;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = product(nums);
        
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
