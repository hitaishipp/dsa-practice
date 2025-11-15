public class rainwaterTrap{
    public static void trappingWater(int arr[]){
        int area=0;
        for(int i=0;i<arr.length;i++){
            
            //left
            int start=i;
            int largestlSum=0;
            for(int j=start;j>=0;j--){
               largestlSum=Math.max(largestlSum,arr[j]);
            }
            //right
            int largestrSum=0;
            for(int j=start;j<arr.length;j++){
               largestrSum=Math.max(largestrSum,arr[j]); 
            }
            int largest=Math.min(largestlSum,largestrSum);
            area+=(largest-arr[i]);
            
            
        }
        System.out.print(area);
    }
    public static void main(String arags[]){
        int arr[]={4,2,0,3,2,5};
        trappingWater(arr);
    }
}