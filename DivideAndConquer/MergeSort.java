package DivideAndConquer;

public class MergeSort {
    public static void mergeS(int arr[],int si, int ei){
        int mid = si + ((ei-si)/2);
        if(si>=ei){
            return;
        }

        mergeS(arr, si, mid);
        mergeS(arr, mid+1, ei);
        merge(arr, si, ei, mid);
    }
    public static void merge(int arr[], int si, int ei, int mid){
        int i = si;
        int j = mid+1;
        int k = 0;
        int temp[] = new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(i=0;i<temp.length;i++){
            arr[si+i] = temp[i];
        }
    }
    public static void main(String args[]){
        int arr[] = {1,4,3,8,7,6,9,0,2};
        mergeS(arr, 0, arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
