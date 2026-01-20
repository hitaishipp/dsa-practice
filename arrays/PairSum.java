public class PairSum {
    public static boolean pairS(int arr[], int target){
        int p1 = 0;
        int p2 = arr.length-1;
        while(p1<p2){
            if(arr[p1]+arr[p2]==target){
                return true;
            }
            if(arr[p1]+arr[p2]<target){
                p1++;
            }
            else{
                p2--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(pairS(arr, 3));
    }
}
