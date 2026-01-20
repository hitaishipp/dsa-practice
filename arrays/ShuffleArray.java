public class ShuffleArray {
   
    public static void shuffle(int[] nums, int n, int result[]) {
        
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];       // xi
            result[index++] = nums[i + n];   
        }

    }
    public static void main(String args[]){
        int arr[] = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = new int[2 * n];
        shuffle(arr, n, result);

        for (int i = 0;i<arr.length;i++) {
            System.out.print(result[i]+" ");
        }
    }
}

