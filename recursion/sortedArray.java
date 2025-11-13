public class sortedArray {
    public static boolean sort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(arr, i+1);

    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6,7};
        System.out.print(sort(num,0));
        
    }
}
