public class insertionSort {
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key = arr[i];
           while((j>=0)&&(arr[j]>key)){
                
                arr[j+1] = arr[j];
                j--;
                
           }
           arr[j+1] = key;
        }
    }
    public static void main(String args[]){
        int arr[]= {1,5,4,2,7,9,-2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            
        }
    }
}
