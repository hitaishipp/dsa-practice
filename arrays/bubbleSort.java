public class bubbleSort {
    public static int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int t=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=t;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]= {1,5,4,2,7,9,-2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            
        }
    }
}
