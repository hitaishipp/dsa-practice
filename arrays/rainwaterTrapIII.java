public class rainwaterTrapIII {                  //two pointer approach( T.C.- O(n))
    public static void trappedWater(int arr[]){
        int left=0,right=arr.length-1,leftMax=0,rightMax=0,total=0;
        while(left<right){
            if(arr[left]<=arr[right]){
                leftMax=Math.max(leftMax,arr[left]);
                total+=(leftMax-arr[left]);
                left++;
            }
            else{
                rightMax=Math.max(rightMax,arr[right]);
                total+=(rightMax-arr[right]);
                right--;
            }
        }
        System.out.print("total water trappped "+total );


    }
    public static void main(String args[]){
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        trappedWater(arr);  
    }
    
}
