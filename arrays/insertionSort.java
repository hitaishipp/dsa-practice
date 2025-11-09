public class insertionSort {
    public static int[] sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
           while((j>0)&&(arr[j-1]>arr[j])){
                
                int t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
                
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
