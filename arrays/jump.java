public class jump{
    public static boolean jumpGame(int arr[]){
        int maxIndex = 0;
        for(int i = 0; i<arr.length;i++){
            if(i>maxIndex){
                return false;
            }
            maxIndex = Math.max(i+arr[i],maxIndex); 
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,1,1,0,7,6};
        System.out.print(jumpGame(arr));
    }
}