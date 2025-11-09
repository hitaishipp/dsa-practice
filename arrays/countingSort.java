public class countingSort {
    public static int[] sort(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
           max=Math.max(max,arr[i]);
        }
        
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<max+1;i++){
            
            if(count[i]==1){
               arr[j]=i;
               j++;
               count[i]--;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]= {1,5,4,2,7,9};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            
        }
    }
}
