public class selectionSort {
    public static int[] sort(int arr[]){
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
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
