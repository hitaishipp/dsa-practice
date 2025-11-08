public class singleNumber {
    public static void singleNum(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        System.out.print("the number is "+ans );
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,3,2,1};
        singleNum(arr);
    }
}
