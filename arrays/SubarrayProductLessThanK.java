public class SubarrayProductLessThanK {
    public static int count(int arr[], int k){
        long currProd = 1;
        int left =0;
        int count=0;
        if(k <= 1) return 0;
        
        for(int right = 0;right<arr.length;right++){
            currProd*=arr[right];
            while(currProd>=k){
                currProd/=arr[left];
                left++;
            }
            count += right-left+1;
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {10, 5, 4, 6, 3, 2, 1};
        int k = 100;
        System.out.println(count(arr, k));
    }
}
